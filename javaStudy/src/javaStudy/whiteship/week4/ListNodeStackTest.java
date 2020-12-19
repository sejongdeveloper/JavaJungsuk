package javaStudy.whiteship.week4;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(ListNodeStack.class)
public class ListNodeStackTest {

	@Test
	void test() {
		int size = 5;
		
		ListNodeStack listNodeStack = new ListNodeStack();
		for(int i=0; i<size; i++) {
			listNodeStack.push(i);
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(listNodeStack.pop());
		}
	}
}
