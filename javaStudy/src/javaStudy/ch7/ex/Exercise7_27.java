package javaStudy.ch7.ex;

class Outer3 {
	int value=10;
	
	class Inner {
		int value=20;
		void method1() {
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	} // InnerŬ������ ��
} // OuterŬ������ ��


public class Exercise7_27 {
	public static void main(String[] args) {
		/*
			(4) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		
		inner.method1();

	}
}
