package com.yedam.oper;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A'; // A = 65
		if (charCode >= 65 & charCode <= 90) { // if 구문 안에 논리값 & 논리값일 때 둘 다 참이면 실행
			System.out.println("대문자입니다.");
		}

		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 && num2++ > 20) { // num1++ < 10 이 false
			System.out.println("참입니다.");
		}
		if (num1++ < 10 || num2++ >= 20) {
			System.out.println("True입니다.");
		}

		System.out.println(num1 + ", " + num2);

		int a = 10, b = 11;
		int result1 = a & b;
		System.out.println(result1);

		int c = 10, d = 11;
		int result2 = c | d;
		System.out.println("논리곱결과: " + result2);

		int result = a << 2;
		System.out.println("비트이동결과: " + result);

		result = 30 << 3;
		System.out.println("비트이동결과: " + result);

		result += 30; // result = result + 30; 복합대입연산자

		result = 80;
		boolean pass = false;
		if (result >= 80) {
			pass = true;
		} else {
			pass = false;
		}

		pass = (result >= 80) ? true : false; // 삼항연산자: 위와 같은 의미

	}
}
