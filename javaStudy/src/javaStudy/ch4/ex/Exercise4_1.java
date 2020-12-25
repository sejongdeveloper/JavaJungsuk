package javaStudy.ch4.ex;

public class Exercise4_1 {
	public static void main(String[] args) {
		int x = 15;
		if(10<x && x<20) {}
		
		char ch = ' ';
		if(!(ch == ' ' || ch == '\t')) {}
		
		if(ch == 'x' || ch == 'X') {}
		
		if('0'<=ch && ch<='9') {}
		
		if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {}
		
		int year = 2020;
		if((year%400==0) || (year%4==0 && year%100 != 0)) {}
		
		boolean powerOn = false;
		if(powerOn == false) {}
		
		String str = "yes";
		if(str.equals("yes")) {}
	}
}
