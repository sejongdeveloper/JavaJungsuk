package javaStudy.whiteship.week4;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(ListNodeQueue.class)
public class ListNodeQueueTest {

	@Test
	void test() {
		int size = 5;
		ListNodeQueue listNodeQueue = new ListNodeQueue();
		for(int i=0; i<size; i++) {
			listNodeQueue.push(i);
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(listNodeQueue.pop());
		}
	}
}
