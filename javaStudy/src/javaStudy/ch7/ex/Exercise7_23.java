package javaStudy.ch7.ex;

public class Exercise7_23 {
	/*
		(1) sumArea�޼��带 �ۼ��Ͻÿ�. 
	*/
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(Shape s : arr) {
			sum += s.calcArea();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("������ ��:"+sumArea(arr)); 
	}
}
