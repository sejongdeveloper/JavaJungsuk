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

// Test Suites란 하나의 메소드를 테스트하기 위한 테스트 메소드를 하나로 묶은것
// Test Suites 를 실행할 때 선택할 패키지 이름 지정
@SelectPackages("javaStudy.whiteship.week4")
// Test Suites 를 실행할 때 선택할 클래스 지정
@SelectClasses({Week4.class})
public class Junit5Test {
	
	@BeforeAll
	static void before1() {
		System.out.println("@BeforeAll는 static 키워드를 사용해야 한다.");
		System.out.println("모든 테스트 메서드보다 가장 먼저 한번 실행된다.");
		System.out.println();
	}
	
	@BeforeEach
	void before2() {
		System.out.println("@BeforeEach는 각각의 테스트 메서드 실행전에 실행된다.");
	}
	
	@AfterAll
	static void after1() {
		System.out.println("@AfterAll는 static 키워드를 사용해야 한다.");
		System.out.println("모든 테스트 메소드보다 이후에 실행된다.");
	}
	
	@AfterEach
	void after2() {
		System.out.println("@AfterEach는 각각의 테스트 메소드 이후에 실행된다.");
		System.out.println();
	}
	
	// 테스트메서드
	@DisplayName("test method1")
	@Test
	void test1() {
		System.out.println("테스트1 시작");
		// assert 주장하다
		assertTrue(1<5); // 참이면 정상
		assertEquals(10+10, 20); // 오른쪽 값이 왼쪽의 결과와 같으면 정상
	}
	
	// 테스트메서드
	@Test
	void test2() {
		System.out.println("테스트2 시작");
		int[] num = {11, 22, 33};
		
		// 그룹으로 묶어서 검사
		assertAll("customName",
			() -> assertEquals(num[0], 11),
			() -> assertEquals(num[1], 22),
			() -> assertEquals(num[2], 33) 
		);
	}
	
	@Test
	@Disabled("test3 method disabled")
	void test3() {
		System.out.println("테스트 비활성화");
	}
	
	@Test
	void test4() {
		int assertResult = 10;
		
		// 첫번째 매개변수의 조건이 충족되어야 두번째 조건이 실행
		assumingThat(
			assertResult != 10, 
			() -> assertFalse(1 == 1)
		);
	}
	
	@Test
	void test5() {
		// 발생한 예외의 세부 사항을 확인?
		Throwable exception = assertThrows(
			NullPointerException.class, 
			() -> {throw new NullPointerException("테스트 null");}
		);
		System.out.println(exception);
		
		assertEquals(exception.getMessage(), "테스트 null");
	}
	
	@Test
	@RepeatedTest(1) // 반복횟수를 지정하여 추가적으로 실행
	void test6() {
		String str = "aaa";
		
		// 예회 유형의 유효성을 검사?
		Throwable exception = assertThrows(
			NumberFormatException.class, 
			() -> {Integer.valueOf(str);}
		);
		System.out.println(exception);
	}
	
}
