package javaStudy.ch4.ex;

public class Exercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(true) {
			if(num == 0) {
				break;
			}
			
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("sum="+sum);
	}
}
