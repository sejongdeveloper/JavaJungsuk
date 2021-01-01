package javaStudy.ch6.ex;

public class Exercise6_22 {

	static boolean isNumber(String str) {
		boolean result = true;
		
		if(str == null || str.equals("")) {
			result = false;
		}
		
		char[] tmp = str.toCharArray();
		for(char ch : tmp) {
			if(!('0'<=ch && ch<='9')) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str)); 
	}
}
