package javaStudy.ch6.ex;

public class Exercise6_6 {
	// 두 점 (x,y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double a = Math.pow(x-x1, 2);
		double b = Math.pow(y-y1, 2);
		
		return Math.sqrt(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
