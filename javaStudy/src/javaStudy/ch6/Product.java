package javaStudy.ch6;

public class Product {
	static int count = 0; // ������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo; // �ν��Ͻ� ������ ��ȣ
	
	{
		++count;
		serialNo = count;
	}
	
	public Product() {} // �⺻������, ��������
}
