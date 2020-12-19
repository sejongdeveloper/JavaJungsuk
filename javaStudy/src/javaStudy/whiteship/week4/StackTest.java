package javaStudy.whiteship.week4;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;

@SelectClasses(Stack.class)
public class StackTest {

	@Test
	void test() {
		int size = 5;
		Stack stack = new Stack(size);
		for(int i=0; i<size; i++) {
			stack.push(i);
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(stack.pop());
		}
	}
}
