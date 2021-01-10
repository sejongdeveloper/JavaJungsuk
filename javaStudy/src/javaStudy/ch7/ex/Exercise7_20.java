package javaStudy.ch7.ex;

public class Exercise7_20 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x); // 100
		p.method(); // child method
		
		System.out.println("c.x = " + c.x); // 200
		c.method(); // child method
	}
}

class Parent2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}