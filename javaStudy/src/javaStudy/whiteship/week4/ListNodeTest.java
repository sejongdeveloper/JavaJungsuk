package javaStudy.whiteship.week4;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(ListNode.class)
public class ListNodeTest {

	@Test
	void test() {
		ListNode head = new ListNode(0); 
		
		for(int i=1; i<5; i++) {
			head.add(head, new ListNode(i), i);
		}
		
		head.print(head);
		System.out.println();
		
		head.add(head, new ListNode(100), 2);
		
		head.print(head);
		System.out.println();
		
		assertTrue(head.contains(head, new ListNode(2)));
		
		head.remove(head, 2);
		head.print(head);
	}
}
