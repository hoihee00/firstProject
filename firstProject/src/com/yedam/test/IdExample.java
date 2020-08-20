package com.yedam.test;

import java.util.Scanner;

public class IdExample {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String[] str = {"-", "*", "/"};

		while (true) {
			System.out.println("--------------------");
			System.out.println("주민등록번호를 입력하세요.");
			System.out.println("--------------------");
			System.out.println("입력> ");

			String str1 = scn.nextLine();
			System.out.println(str1.replace("-","").charAt(6));
//			String str2 = "010102*2345678";
//			System.out.println(str2.replace("*","").charAt(6));
//			String str3 = "010102/2345678";
//			System.out.println(str3.replace("/","").charAt(6));

//			String id = scn.nextLine();
//			char sex = id.charAt(7);
			if (str1.replace("-","").charAt(6) == '1' || str1.replace("-","").charAt(6) == '3') {// sex==1 또는 3 이면 남자
				System.out.println("남자");
			}
			else if (str1.replace("-","").charAt(6) == '2' || str1.replace("-","").charAt(6) == '4') {// sex==2 또는 4 이면 여자
				System.out.println("여자");
				
			}
			
		} //while
	} //end of main
	
} //end of class
