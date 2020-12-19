package javaStudy.whiteship.week4;

public class ArrayQueue {

	int data[];
	int size;
	int rear = -1; // 삽입과 관련된 인덱스
	int front = -1; // 삭제와 관련된 인덱스
	
	public ArrayQueue(int size) {
		this.size = size;
		data = new int[size];
	}
	
	public void push(int data) {
		// 삽입 인덱스는 배열크기보다 같거나 크면 꽉 찼다고 판단
		if(size <= rear) {
			System.out.println("QueueArray 꽉 찼습니다.");
			return;
		}
		
		this.data[++rear] = data;
	}
	
	public int pop() {
		// 삽입과 삭제 인덱스가 같으면 비었다고 판단
		if(rear == front) {
			System.out.println("QueueArray 비어있습니다.");
			return -1;
		}
		
		return data[++front];
	}
}
