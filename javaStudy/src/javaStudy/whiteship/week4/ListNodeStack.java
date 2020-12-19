package javaStudy.whiteship.week4;

public class ListNodeStack {

	ListNode head;
	int position = -1;
	
	public void push(int data) {
		// ó���� ���
		if(position < 0) {
			position++;
			head = new ListNode(data); 
			return;
		}
		
		// ó���� �ƴ� ���
		ListNode listNode = head;
		while(true) {
			if(listNode.link == null) {
				break;
			}
			
			listNode = listNode.link;
		}
		
		// ��ġ ����
		position++;
		listNode.link = new ListNode(data);
	}
	
	public int pop() {
		if(position < 0) {
			System.out.println("ListNodeStack�� ����ֽ��ϴ�.");
			return -1;
		}
		
		ListNode listNode = head;
		for(int i=0; i<position; i++) {
			listNode = listNode.link;
		}
		
		// ��ġ ����
		position--;
		return listNode.data;
	}
}
