package com.yedam.cond;

public class ForExample {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("최종 결과는 " + sum);

		sum = 0;
		for (int a = 0; a < 3; a++) {
			sum = sum + 1;
		}
		sum += 1;
		System.out.println("최종 결과는 " + sum);

		// 1~10 범위 수 합계
		sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum = sum + i;
		}
		// 1= 0 + 1;
		// 3 = 1 + 2;
		// 6 = 3 + 3;
		System.out.println("1 ~ 10 합: " + sum);

		// 구구단 2단 출력
		int num = 2;

		for (; num <= 9; num++) {
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
			}
		}
//		System.out.println(num + " * " + 1 + " = " + (num * 1));
//		System.out.println(num + " * " + 2 + " = " + (num * 2));
//		System.out.println(num + " * " + 3 + " = " + (num * 3));
//		System.out.println(num + " * " + 4 + " = " + (num * 4));
//		System.out.println(num + " * " + 5 + " = " + (num * 5));
//		System.out.println(num + " * " + 6 + " = " + (num * 6));
//		System.out.println(num + " * " + 7 + " = " + (num * 7));
//		System.out.println(num + " * " + 8 + " = " + (num * 8));
//		System.out.println(num + " * " + 9 + " = " + (num * 9));
	}

}
