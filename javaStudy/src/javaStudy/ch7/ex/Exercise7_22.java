package javaStudy.ch7.ex;

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape {
	double r; // ������
	
	public Circle() {}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(int x, int y, double r) {
		super(new Point(x, y));
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	double width; // ��
	double height; // ����
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
}

public class Exercise7_22 {

}
