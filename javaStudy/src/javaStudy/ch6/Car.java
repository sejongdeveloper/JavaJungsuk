package javaStudy.ch6;

public class Car {
	String color; // ����
	String gearType; // ���ұ� ���� - auto(�ڵ�), manual(����)
	int door; // ���� ����
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c) { // �ν��Ͻ��� ���縦 ���� ������
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}
