package javaStudy.ch2;

public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; // char ch = 65;
		int code = (int) ch; // ch�� ����� ���� intŸ������ ��ȯ�Ͽ� �����Ѵ�.
		
		System.out.printf("%c=%d (%#X)%n", ch, code, code);
		
		char hch = '��';
		System.out.printf("%c=%d (%#X)%n", hch, (int)hch, (int)hch);
	}
}
