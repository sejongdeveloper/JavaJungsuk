package javaStudy.ch6.ex;

public class Exercise6_9 {
	int x=0, y=0; // Marine�� ��ġ��ǥ(x,y)
	int hp = 60; // ���� ü��
	static int weapon = 6; // ���ݷ� => ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.
	static int armor = 0; // ���� =>  ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.
	
	static void weaponUp() {
		weapon++;
	}
	
	static void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
