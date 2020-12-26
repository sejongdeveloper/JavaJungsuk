package javaStudy.ch4.ex;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp !=0) {
			/*
			String str = String.valueOf(tmp);
			
			int ten = 1;
			for(int i=1; i<=str.length()-1; i++) {
				ten *= 10;
			}
			result += tmp%10 * ten;
			
			tmp/=10;
			*/
			result = result*10 + tmp % 10; // 기존 결과에 10을 곱해서 더한다.
			tmp /=10;
		}
		
		if(number == result)
			System.out.println( number + "는 회문수 입니다."); 
		else
			System.out.println( number + "는 회문수가 아닙니다."); 
	} // main
}
