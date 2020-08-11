package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = 3 + (8 - 5) * 4 + val1++;

		System.out.println(result);

		// 나머지 계산
		result = 10 % 7;
		System.out.println("나머지 : " + result);

		// 나누기 계산
		result = 10 / 7;
		System.out.println("나누기1 : " + result);

		// 소수점 이하 나누기
		double r1 = 10 / 0.7; // 실수 = 정수 / 실수
		System.out.println("나누기2 : " + r1);

		// 짝수와 홀수 구분해서 출력
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i +"홀수입니다."); // 조건을 만족하면 출력
			} else {
				System.out.println(i +"짝수입니다.");	// 조건을 만족하지 않으면 출력
			}
		}
	}
}
