package javaStudy.ch4;

import java.util.Scanner;

public class FlowEx27 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true; // while���� ���ǽ����� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �̷��ϼ���.(�������� 0�� �Է�)");
		
		while(flag) { // flag�� ���� true�̹Ƿ� ���ǽ��� ���� �ȴ�.
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num; // num�� 0�� �ƴϸ�, sum�� ���Ѵ�.
			} else {
				flag = false; // num�� 0�̸�, flag�� ���� false�� ����.
			}
		} // while���� ��
		
		System.out.println("�հ�:"+sum);
	}
}