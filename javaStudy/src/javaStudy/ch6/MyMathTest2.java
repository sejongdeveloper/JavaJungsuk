package javaStudy.ch6;

public class MyMathTest2 {
	public static void main(String[] args) {
		// Ŭ�����޼��� ȣ��. �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); // �ν��Ͻ��� ����
		mm.a = 200L;
		mm.b = 100L;
		// �ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
