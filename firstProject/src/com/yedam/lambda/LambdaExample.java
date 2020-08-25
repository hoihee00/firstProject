package com.yedam.lambda;

import java.sql.CallableStatement;

import com.yedam.classes.Cal;

// 함수적 인터페이스 (Functional Interface)
interface MyFunctionalInterface {
	public void run(); // 추상 메소드(abstract method)
}

class MyFuncClass implements MyFunctionalInterface {
	@Override
	public void run() {
		System.out.println("runnnnnn");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf = () -> {
			System.out.println("runn");
		};
		myintf.run();
		
		ShowContent sc = (content) -> {
				System.out.println("내용은 " + content + " 입니다.");
		};
		sc.show("바나나");
		
		ShowContent sc2 = (content) -> {
				System.out.println("this is " + content + ".");
		};
		sc2.show("바나나");// this is 바나나.
		
		Calculate cal = (a, b) -> a + b;
		System.out.println("결과" + cal.sum(10, 5));
	}
}