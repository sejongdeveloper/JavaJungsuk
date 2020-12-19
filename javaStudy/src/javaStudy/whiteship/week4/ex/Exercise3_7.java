package javaStudy.whiteship.week4.ex;

public class Exercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9.0f * (fahrenheit - 32)*1000+0.5)/1000f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}
