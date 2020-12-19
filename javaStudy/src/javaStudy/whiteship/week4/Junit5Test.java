package javaStudy.whiteship.week4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;

// Test Suites�� �ϳ��� �޼ҵ带 �׽�Ʈ�ϱ� ���� �׽�Ʈ �޼ҵ带 �ϳ��� ������
// Test Suites �� ������ �� ������ ��Ű�� �̸� ����
@SelectPackages("javaStudy.whiteship.week4")
// Test Suites �� ������ �� ������ Ŭ���� ����
@SelectClasses({Week4.class})
public class Junit5Test {
	
	@BeforeAll
	static void before1() {
		System.out.println("@BeforeAll�� static Ű���带 ����ؾ� �Ѵ�.");
		System.out.println("��� �׽�Ʈ �޼��庸�� ���� ���� �ѹ� ����ȴ�.");
		System.out.println();
	}
	
	@BeforeEach
	void before2() {
		System.out.println("@BeforeEach�� ������ �׽�Ʈ �޼��� �������� ����ȴ�.");
	}
	
	@AfterAll
	static void after1() {
		System.out.println("@AfterAll�� static Ű���带 ����ؾ� �Ѵ�.");
		System.out.println("��� �׽�Ʈ �޼ҵ庸�� ���Ŀ� ����ȴ�.");
	}
	
	@AfterEach
	void after2() {
		System.out.println("@AfterEach�� ������ �׽�Ʈ �޼ҵ� ���Ŀ� ����ȴ�.");
		System.out.println();
	}
	
	// �׽�Ʈ�޼���
	@DisplayName("test method1")
	@Test
	void test1() {
		System.out.println("�׽�Ʈ1 ����");
		// assert �����ϴ�
		assertTrue(1<5); // ���̸� ����
		assertEquals(10+10, 20); // ������ ���� ������ ����� ������ ����
	}
	
	// �׽�Ʈ�޼���
	@Test
	void test2() {
		System.out.println("�׽�Ʈ2 ����");
		int[] num = {11, 22, 33};
		
		// �׷����� ��� �˻�
		assertAll("customName",
			() -> assertEquals(num[0], 11),
			() -> assertEquals(num[1], 22),
			() -> assertEquals(num[2], 33) 
		);
	}
	
	@Test
	@Disabled("test3 method disabled")
	void test3() {
		System.out.println("�׽�Ʈ ��Ȱ��ȭ");
	}
	
	@Test
	void test4() {
		int assertResult = 10;
		
		// ù��° �Ű������� ������ �����Ǿ�� �ι�° ������ ����
		assumingThat(
			assertResult != 10, 
			() -> assertFalse(1 == 1)
		);
	}
	
	@Test
	void test5() {
		// �߻��� ������ ���� ������ Ȯ��?
		Throwable exception = assertThrows(
			NullPointerException.class, 
			() -> {throw new NullPointerException("�׽�Ʈ null");}
		);
		System.out.println(exception);
		
		assertEquals(exception.getMessage(), "�׽�Ʈ null");
	}
	
	@Test
	@RepeatedTest(1) // �ݺ�Ƚ���� �����Ͽ� �߰������� ����
	void test6() {
		String str = "aaa";
		
		// ��ȸ ������ ��ȿ���� �˻�?
		Throwable exception = assertThrows(
			NumberFormatException.class, 
			() -> {Integer.valueOf(str);}
		);
		System.out.println(exception);
	}
	
}
