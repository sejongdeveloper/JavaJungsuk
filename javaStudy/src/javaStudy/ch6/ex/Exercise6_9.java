package javaStudy.ch6.ex;

public class Exercise6_9 {
	int x=0, y=0; // Marine의 위치좌표(x,y)
	int hp = 60; // 현재 체력
	static int weapon = 6; // 공격력 => 모든 병사의 공격력과 방어력은 같아야 한다.
	static int armor = 0; // 방어력 =>  모든 병사의 공격력과 방어력은 같아야 한다.
	
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
