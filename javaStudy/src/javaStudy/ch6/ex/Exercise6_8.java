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
	// Ŭ��������(static����) : width, height
	// �ν��Ͻ����� : kind, num
	// �������� : k, n, args, card
}
