package javaStudy.ch12;

class Parent {
	void ParentMethod() {}
}

class Child extends Parent {
	@Override
	void ParentMethod1() {} // ���� �޼����� �̸��� �߸� ������
}

public class AnnotationEx1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.ParentMethod1();
	}
}
