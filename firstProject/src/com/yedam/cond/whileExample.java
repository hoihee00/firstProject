package com.yedam.cond;

public class whileExample {

	public static void main(String[] args) {

		// 구구단 while을 사용해서 출력:
		int num = 2;
		int j = 1;
		while (num <= 9) {
			j = 1;
			while (j <= 9) {
				System.out.println(num + " X " + j + " = " + (num * j));
				j++;
			}
			num++;
		}

		// 1 ~ 10 값의 합:
		int i = 0;
		int sum = 0;
		while (i < 10) {
			i++;
			sum += i;
			System.out.println(i);
		}
		System.out.println("1 ~ " + i + " 까지 합: " + sum);

	}
}
