package javaStudy.whiteship.week4;

public class ArrayQueue {

	int data[];
	int size;
	int rear = -1; // ���԰� ���õ� �ε���
	int front = -1; // ������ ���õ� �ε���
	
	public ArrayQueue(int size) {
		this.size = size;
		data = new int[size];
	}
	
	public void push(int data) {
		// ���� �ε����� �迭ũ�⺸�� ���ų� ũ�� �� á�ٰ� �Ǵ�
		if(size <= rear) {
			System.out.println("QueueArray �� á���ϴ�.");
			return;
		}
		
		this.data[++rear] = data;
	}
	
	public int pop() {
		// ���԰� ���� �ε����� ������ ����ٰ� �Ǵ�
		if(rear == front) {
			System.out.println("QueueArray ����ֽ��ϴ�.");
			return -1;
		}
		
		return data[++front];
	}
}
