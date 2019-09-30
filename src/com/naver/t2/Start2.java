package com.naver.t2;

public class Start2 {

	public static void main(String [] args) {
		System.out.println("Start2 start !!!!!");
		
		PrintTest3 pt3 = new PrintTest3();
		//클래스명 변수명 = new 클래스명();
		
		pt3.info4();
		//변수명.메서드명();
		
		pt3.info5();
		//클래스명은 같으므로 다시해줄필요 없다.
		
		
		System.out.println("Start2 finish !!!!!");
	}
}
