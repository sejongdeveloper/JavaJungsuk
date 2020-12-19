package javaStudy.whiteship.week4;

public class ListNodeQueue {

	ListNode head;
	int rear = -1;
	int front = -1;
	
	public void push(int data) {
		// ó���� ���
		if(rear == -1) {
			rear++;
			head = new ListNode(data);
			return;
		}
		
		// ó���� �ƴ� ���
		ListNode listNode = head;
		for(int i=0; i<rear; i++) {
			listNode = listNode.link;
		}
		
		rear++;
		listNode.link = new ListNode(data);
	}
	
	public int pop() {
		// ����ִ��� ��ȿ�� �˻�
		if(rear == front) {
			System.out.println("ListNodeQueue ����ֽ��ϴ�.");
			return -1;
		}
		
		front++;
		int tmp = head.data;
		head = head.link;
		
		return tmp;
	}
}
