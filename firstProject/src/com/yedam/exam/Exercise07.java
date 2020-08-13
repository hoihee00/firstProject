package com.yedam.exam;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, input = 0, output = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
			System.out.println("--------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			
			if(menu == 1) { //예금
				System.out.println("예금하실 금액을 입력하세요> ");
				input = scanner.nextInt();
				balance = balance + input;
				
			} else if (menu == 2) { // 출금
				System.out.println("출금하실 금액을 입력하세요> ");
				output = scanner.nextInt();
				balance = balance - output;
				if (output > balance) {
					balance = balance + output;
					System.out.println("출금 가능한 금액을 초과하였습니다.");
				}
				
				
			} else if (menu == 3) { // 잔고
				System.out.println("잔액: " + balance);
			
			} else if (menu == 4)
				run = false;
		} // end of while
		System.out.println("프로그램이 종료됩니다.");
	} // end of main
} // end of class
