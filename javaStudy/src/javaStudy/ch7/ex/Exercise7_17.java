package javaStudy.ch7.ex;

class Marine extends Unit { // ����
	void stimPack() { /* �������� ����Ѵ�.*/} 
}
class Tank extends Unit { // ��ũ
	void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */} 
}
class Dropship extends Unit { // ���ۼ�
	void load() { /* ���õ� ����� �¿��.*/ } 
	void unload() { /* ���õ� ����� ������.*/ } 
}

class Unit {
	int x, y; // ���� ��ġ
	void move(int x, int y) { /* ������ ��ġ�� �̵� */ }
	void stop() { /*���� ��ġ�� ���� */ }	
}

public class Exercise7_17 {

}
