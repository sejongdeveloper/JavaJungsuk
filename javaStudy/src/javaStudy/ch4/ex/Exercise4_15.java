package javaStudy.ch4.ex;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result =0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp !=0) {
			/*
			String str = String.valueOf(tmp);
			
			int ten = 1;
			for(int i=1; i<=str.length()-1; i++) {
				ten *= 10;
			}
			result += tmp%10 * ten;
			
			tmp/=10;
			*/
			result = result*10 + tmp % 10; // ���� ����� 10�� ���ؼ� ���Ѵ�.
			tmp /=10;
		}
		
		if(number == result)
			System.out.println( number + "�� ȸ���� �Դϴ�."); 
		else
			System.out.println( number + "�� ȸ������ �ƴմϴ�."); 
	} // main
}
