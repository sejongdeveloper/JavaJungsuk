package javaStudy.whiteship.week4;

public class ListNode {
	int data; // 정수를 저장하는 변수
	ListNode link; // 다음 노드를 연결하는 변수
	int position;
	
	public ListNode(int data) {
		this.data = data;
	}
	
	public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
		/*
		 *  head를 바꾸는 경우
		 *  추가할 노드의 link를 기존 head로 변경
		 */
		if(position == 0) {
			nodeToAdd.link = head;
			return nodeToAdd;
		}
		
		ListNode listNode = head;
		for(int i=0; i<position-1; i++) {
			try {
				listNode = listNode.link;
			} catch (NullPointerException e) {
				System.out.println("add에러 position의 값을 확인하세요.");
				return null;
			}
		}
		
		// position 전의 노드가 가리키고 있는 link를 추가할 노드의 link로 변경
		nodeToAdd.link = listNode.link;
		
		// position 전의 노드의 link를 추가할 노드로 변경
		listNode.link = nodeToAdd;
		
		return head;
	}
	
	public ListNode remove(ListNode head, int positionToRemove) {
		ListNode listNode = head;
		for(int i=0; i<positionToRemove-1; i++) {
			try {
				listNode = listNode.link;
			} catch (NullPointerException e) {
				System.out.println("remove에러 position의 값을 확인하세요.");
				return null;
			}
		}
		
		// 삭제할 노드의 이전노드의 link를 삭제할 노드의 link로 변경
		listNode.link = listNode.link.link;
		return head;
	}
	
	public boolean contains(ListNode head, ListNode nodeToCheck) {
		ListNode listNode = head;
		
		// 노드의 값 비교를 통해 참거짓 구분
		while(true) {
			if(listNode.link == null) {
				break;
			}
			
			if(listNode.data == nodeToCheck.data) {
				return true;
			}
			
			listNode = listNode.link;
		}
		return false;
	}
	
	public void print(ListNode head) {
		ListNode listNode = head;
		
		// 노드를 순회하며 각 노드의 데이터값 출력
		while(true) {
			System.out.println(listNode.data);
			if(listNode.link == null) {
				break;
			}
			listNode = listNode.link;
		}
	}
}


