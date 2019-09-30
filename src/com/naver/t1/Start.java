package com.naver.t1;

public class Start {

	public static void main(String [] args) {
		// comment 주석 설명문
		// 소스코드에 설명을 작성할 때 사용
		// 컴파일 시에는 컴파일 되지 않음
		
		// 주석의 종류 
		// 1. 단일 주석(한줄주석) : //
		// System.out.println("주석입니다.");
		System.out.println("주석아닙니다.");
		
		// 2. 여러줄 주석 : /* ~ */
		/* 
		 * System.out.println("주석입니다.");
		 */
		
		// 3. 문서용 주석 : /** ~ */
		/**
		 * java에서 Document 문서 만들기에 사용되는 주석
		 */
		
		//클래스 명 변수명 = new 클래스명 ();
		//클래스의 객체를 생성
		PrintTest pt = new PrintTest();
		//객체의 멤버메서드 호출(사용)
		pt.info1();
		//변수명.메서드명();
		
		PrintTest2 pt2 = new PrintTest2();
		pt2.info2();
		
		pt.info3();
		
		System.out.println("프로그램종료");
		
		
	}
}
