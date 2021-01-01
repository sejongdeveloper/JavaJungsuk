package javaStudy.ch6.ex;

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
	
	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
	}
}


class Exercise6_8 {
	// 클래스변수(static변수) : width, height
	// 인스턴스변수 : kind, num
	// 지역변수 : k, n, args, card
}
