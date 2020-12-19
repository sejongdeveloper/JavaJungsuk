package javaStudy.whiteship.week4;

public class ListNodeStack {

	ListNode head;
	int position = -1;
	
	public void push(int data) {
		// 처음인 경우
		if(position < 0) {
			position++;
			head = new ListNode(data); 
			return;
		}
		
		// 처음이 아닌 경우
		ListNode listNode = head;
		while(true) {
			if(listNode.link == null) {
				break;
			}
			
			listNode = listNode.link;
		}
		
		// 위치 증가
		position++;
		listNode.link = new ListNode(data);
	}
	
	public int pop() {
		if(position < 0) {
			System.out.println("ListNodeStack이 비어있습니다.");
			return -1;
		}
		
		ListNode listNode = head;
		for(int i=0; i<position; i++) {
			listNode = listNode.link;
		}
		
		// 위치 감소
		position--;
		return listNode.data;
	}
}
