package javaStudy.ch7.ex;

import java.util.Arrays;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Tv2());
		b.buy(new Audio2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		b.buy(new Computer2());
		
		b.summary();

	}
}	

class Buyer {
	int money = 1000;
	Product2[] cart = new Product2[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index 
	
	void buy(Product2 p) {
		/*
		 	(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
			1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�. 
			1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
			1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		 */
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"��/�� ��� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		add(p);
	}
	
	void add(Product2 p) {
		/*
			(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
			1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
			1.1.1  ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�. 
			1.1.2  ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�. 
			1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�. 
			1.2  ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.  
		*/
		if(i >= cart.length) {
			Product2[] tmp = new Product2[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
	} // add(Product p)
	
	void summary() {
		/*
		(3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 
			1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�. 
			1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�. 
			1.3  ������ ��� ���� �ݾ�(money)�� ����Ѵ�. 
		*/
		int sum = 0;
		String list = "";
		
		for(int i=0; i<cart.length; i++) {
			sum += cart[i].price;
			list += (i==0) ? ""+cart[i] : ","+cart[i];
		}
		
		System.out.println("������ ����:"+list);
		System.out.println("����� �ݾ�:"+sum);
		System.out.println("���� �ݾ�:"+money);
	} // summary()
}

class Product2 {
	int price; // ��ǰ�� ����
	
	Product2(int price) {
		this.price = price;
	}
}

class Tv2 extends Product2 {
	Tv2() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	
	public String toString() { return "Computer";}
}

class Audio2 extends Product2 {
	Audio2() { super(50); }
	
	public String toString() { return "Audio"; }
}
