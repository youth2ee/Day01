package com.naver.t2;

public class PrintTest3 {

	public void info4() {
		System.out.println("Info4 start");
		
		System.out.println("Info4 finish");
	}
	
	public void info5() {
		System.out.println("7+5");
		System.out.print("Sum : ");
		//println은 엔터친 것.
		//print는 엔터치지 않은 것.
		//printf
		System.out.println(7+5);
		System.out.println(7*5);
		
		// ""안에 있는 내용은 문자로 인식. 연산기호도 그냥 문자일뿐
		// ""가 없다면 더하기를 인식. 연산기호를 인식
	}
}
