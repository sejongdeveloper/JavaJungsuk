package javaStudy.ch7.ex;

class Parent {
	int x=100; // 200
	
	Parent() {
		this(200);
	}
	
	Parent(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}
class Child extends Parent {
	int x = 3000; // 1000
	
	Child() {
		this(1000);
	}
	
	Child(int x) {
		this.x = x;
	}
}


public class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child(); // Child() Child(int x) Parent() Parent(int x) Object()
		
		System.out.println("x="+c.getX()); // 200
	}
}
