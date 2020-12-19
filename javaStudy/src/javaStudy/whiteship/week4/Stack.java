package javaStudy.whiteship.week4;

public class Stack {
	int data[]; // 스택 값 저장배열
	int size; // 스택크기
	int position = -1; // 스택 인덱스
	
	public Stack(int size) {
		this.size = size;
		data = new int[size];
	}
	
	public void push(int data) {
		if(size == position) {
			System.out.println("배열이 꽉 찼습니다.");
			return;
		}
		
		// 포지션 변경(+) 후 값 대입
		this.data[++position] = data;
	}
	
	public int pop() {
		if(position < 0) {
			System.out.println("배열이 비어있습니다.");
			return -1;
		}
		
		// 값을 반환 후 포지션 변경(-)
		return data[position--];
	}
}
