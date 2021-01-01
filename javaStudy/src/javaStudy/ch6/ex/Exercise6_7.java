package javaStudy.ch6.ex;

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double a = Math.pow(x-x1, 2);
		double b = Math.pow(y-y1, 2);
		
		return Math.sqrt(a+b);
	}
}

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}
