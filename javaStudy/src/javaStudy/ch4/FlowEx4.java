package javaStudy.ch4;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args) {
		int score = 0; // ������ �����ϱ� ���� ����
		char grade = ' '; // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if(score >= 90) { // score�� 90�� ���� ���ų� ũ�� A����
			grade = 'A';
		} else if(score >= 80) { // score�� 80�� ���� ���ų� ũ�� B����
			grade = 'B'	;
		} else if(score >= 70) { // score�� 70�� ���� ���ų� ũ�� C����
			grade = 'C'	;
		} else {
			grade = 'D'; // �������� D����
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}