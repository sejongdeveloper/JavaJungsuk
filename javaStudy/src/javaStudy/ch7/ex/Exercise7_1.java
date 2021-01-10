package javaStudy.ch7.ex;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		/*
		(1) 배열 SutdaCard를 적절히 초기화 하시오. 
		*/
		
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int j = (int) (Math.random() * cards.length);
			
			SutdaCard tmp = null;
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		if(!(0<=index && index <= cards.length)) {
			System.out.println("잘못된 입력입니다.");
			return null;
		}
		
		return cards[index];
	}
	
	public SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		
		return pick(index);
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다. 
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}
