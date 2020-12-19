package javaStudy.whiteship.week4;

public class Stack {
	int data[]; // ���� �� ����迭
	int size; // ����ũ��
	int position = -1; // ���� �ε���
	
	public Stack(int size) {
		this.size = size;
		data = new int[size];
	}
	
	public void push(int data) {
		if(size == position) {
			System.out.println("�迭�� �� á���ϴ�.");
			return;
		}
		
		// ������ ����(+) �� �� ����
		this.data[++position] = data;
	}
	
	public int pop() {
		if(position < 0) {
			System.out.println("�迭�� ����ֽ��ϴ�.");
			return -1;
		}
		
		// ���� ��ȯ �� ������ ����(-)
		return data[position--];
	}
}
