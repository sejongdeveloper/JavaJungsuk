package javaStudy.whiteship.week4;

public class ListNode {
	int data; // ������ �����ϴ� ����
	ListNode link; // ���� ��带 �����ϴ� ����
	int position;
	
	public ListNode(int data) {
		this.data = data;
	}
	
	public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
		/*
		 *  head�� �ٲٴ� ���
		 *  �߰��� ����� link�� ���� head�� ����
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
				System.out.println("add���� position�� ���� Ȯ���ϼ���.");
				return null;
			}
		}
		
		// position ���� ��尡 ����Ű�� �ִ� link�� �߰��� ����� link�� ����
		nodeToAdd.link = listNode.link;
		
		// position ���� ����� link�� �߰��� ���� ����
		listNode.link = nodeToAdd;
		
		return head;
	}
	
	public ListNode remove(ListNode head, int positionToRemove) {
		ListNode listNode = head;
		for(int i=0; i<positionToRemove-1; i++) {
			try {
				listNode = listNode.link;
			} catch (NullPointerException e) {
				System.out.println("remove���� position�� ���� Ȯ���ϼ���.");
				return null;
			}
		}
		
		// ������ ����� ��������� link�� ������ ����� link�� ����
		listNode.link = listNode.link.link;
		return head;
	}
	
	public boolean contains(ListNode head, ListNode nodeToCheck) {
		ListNode listNode = head;
		
		// ����� �� �񱳸� ���� ������ ����
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
		
		// ��带 ��ȸ�ϸ� �� ����� �����Ͱ� ���
		while(true) {
			System.out.println(listNode.data);
			if(listNode.link == null) {
				break;
			}
			listNode = listNode.link;
		}
	}
}


