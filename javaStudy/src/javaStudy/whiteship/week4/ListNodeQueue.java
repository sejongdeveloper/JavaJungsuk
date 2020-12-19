package javaStudy.whiteship.week4;

public class ListNodeQueue {

	ListNode head;
	int rear = -1;
	int front = -1;
	
	public void push(int data) {
		// 처음인 경우
		if(rear == -1) {
			rear++;
			head = new ListNode(data);
			return;
		}
		
		// 처음이 아닌 경우
		ListNode listNode = head;
		for(int i=0; i<rear; i++) {
			listNode = listNode.link;
		}
		
		rear++;
		listNode.link = new ListNode(data);
	}
	
	public int pop() {
		// 비어있는지 유효성 검사
		if(rear == front) {
			System.out.println("ListNodeQueue 비어있습니다.");
			return -1;
		}
		
		front++;
		int tmp = head.data;
		head = head.link;
		
		return tmp;
	}
}
