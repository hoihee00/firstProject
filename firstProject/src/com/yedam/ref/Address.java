package com.yedam.ref;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {

		Friend[] fAry = new Friend[2];

		boolean run = true;
		String input1;
		int input2;
		String input3;
		String input4;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.정보입력  2.리스트  3.이름조회  4.이름수정  9.종료");
			System.out.print("선택>");

			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				for (int i = 0; i < fAry.length; i++) {
					System.out.println("추가할 내용을 입력하시오.");
					System.out.println("이름: ");
					input1 = scn.nextLine();

					System.out.println("나이: ");
					input2 = scn.nextInt();
					scn.nextLine();

					System.out.println("전화번호: ");
					input3 = scn.nextLine();

					Friend f1 = new Friend(input1, input2, input3);
					fAry[i] = f1;
				}
				System.out.println("내용이 추가되었습니다.");

			} else if (menu == 2) {
				for(int i = 0; i < fAry.length; i++)
				System.out.println("이름: " + fAry[i].getName() + "/ 나이: " + fAry[i].getAge() + "/ 전화번호: " + fAry[i].getTel());

			}
			else if(menu == 3) {
				System.out.println("조회할 이름을 입력하시오.");
				for(int i = 0; i < fAry.length; i++) {
					input4 = scn.nextLine();
					if(fAry[i].getName()=)
					System.out.println(fAry[i]);
					continue;
				}
				}
				
			}
//			else if(menu == 4) {
//				System.out.println("조회할 이름을 입력하시오.");
//				
//			}
			if (menu == 9)
				run = false;
		}
		System.out.println("프로그램이 종료됩니다.");

	}

}
