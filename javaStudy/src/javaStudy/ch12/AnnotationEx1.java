package javaStudy.ch12;

class Parent {
	void ParentMethod() {}
}

class Child extends Parent {
	@Override
	void ParentMethod1() {} // 조상 메서드의 이름을 잘못 적엇음
}

public class AnnotationEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.ParentMethod1();
	}
}
