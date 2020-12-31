package javaStudy.ch6;

public class Car {
	String color; // 색상
	String gearType; // 변소기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(Car c) { // 인스턴스의 복사를 위한 생성자
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
