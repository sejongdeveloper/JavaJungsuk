package javaStudy.ch4.ex;

public class Exercise4_4 {
	public static void main(String[] args) {
		/*
		int sum = 0;
		int i = 1;
		for(; sum<=100; i++) {
			if(i%2==0) {
				sum += -(i);
			} else {
				sum += i;
			}
		}
		
		System.out.println(i);
		*/
		
		int sum = 0;
		int s = 1;
		int num = 0;
		
		for(int i=1; sum<100; i++, s=-s) {
			num = s * i;
			sum += num;
		}
		
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}
}
