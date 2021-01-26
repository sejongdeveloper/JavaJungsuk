package javaStudy.ch12;

enum Transportation {
	BUS(100) { int fare(int distance) { return distance*BASIC_FAIR; } },
	TRAIN(150) { int fare(int distance) { return distance*BASIC_FAIR; } },
	SHIP(100) { int fare(int distance) { return distance*BASIC_FAIR; } },
	AIRPLANE(300) { int fare(int distance) { return distance*BASIC_FAIR; } };
	
	protected final int BASIC_FAIR; // protected로 해야 각 상수에게 접근가능
	
	Transportation(int basicFare) { // private Transportation(int basicFare) {
		BASIC_FAIR = basicFare;
	}
	
	public int getBasicFare() { return BASIC_FAIR; }
	
	abstract int fare(int distance); // 거리에 따른 요금 계산
}

public class EnumEx3 {
	public static void main(String[] args) {
		System.out.println("bus fare="+Transportation.BUS.fare(100));
		System.out.println("train fare="+Transportation.TRAIN.fare(100));
		System.out.println("ship fare="+Transportation.SHIP.fare(100));
		System.out.println("airplane fare="+Transportation.AIRPLANE.fare(100));
	}
}
