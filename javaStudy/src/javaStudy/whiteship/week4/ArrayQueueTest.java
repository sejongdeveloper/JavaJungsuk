package javaStudy.whiteship.week4;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(ArrayQueue.class)
public class ArrayQueueTest {

	@Test
	void test() {
		int size = 5;
		ArrayQueue queueArray = new ArrayQueue(size);
		for(int i=0; i<size; i++) {
			queueArray.push(i);
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(queueArray.pop());
		}
	}
}
