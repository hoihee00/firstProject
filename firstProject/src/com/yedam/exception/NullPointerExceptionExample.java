package com.yedam.exception;

import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String str = null;
//		String str = "Hello";

		try {
			System.out.println(str.toString()); // 에러 발생 구문 - try-catch 구문으로 예외 처리
		} catch (NullPointerException e) {
			System.out.println("Null 값을 참조하고 있습니다.");
		} catch (Exception e1) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}

		int[] intAry = new int[5];
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("i의 값: " + intAry[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");
				System.out.println();
			}

			Scanner scn = new Scanner(System.in);
			System.out.println("숫자 입력하세요.");
			try {
				int menu = scn.nextInt(); // int 타입이 아닌 값을 입력하면 InputMismatchException 에러 발생
				System.out.println();
			} catch (Exception e) {
				System.out.println("문자 입력 불가");
				System.out.println("정확한 숫자 입력 바랍니다.");
			}
			
			System.out.println("정상 종료");

		}

	}
}
