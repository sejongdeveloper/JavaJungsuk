package javaStudy.ch4;

public class FlowEx26 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	} // main�� ��
}
