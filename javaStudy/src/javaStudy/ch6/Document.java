package javaStudy.ch6;

public class Document {
	static int count = 0;
	String name; // ������(Document name)
	
	Document() { // ���� ���� �� �������� �������� �ʾ��� ��
		this("�������" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}
