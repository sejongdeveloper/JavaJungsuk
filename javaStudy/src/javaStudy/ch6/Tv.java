package javaStudy.ch6;

public class Tv {
	// Tv�� �Ӽ�(�������)
	String color; // ����
	boolean power; // ��������(on/off)
	int channel; // ä��
	
	// Tv�� ���(�޼���)
	void power() { power = !power; } // TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; } // TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel; } // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}
