package javaStudy.ch6.ex;

public class Exercise6_1 {
	
}

class SutdaCard {
	int num = (int) (Math.random()*10)+1;
	boolean isKwang;
	
	{
		if(num == 8) {
			isKwang = true;
		}
	}
	
	public SutdaCard() {}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info() {
		return num == 8 ? "1K" : String.valueOf(num);
	}
}