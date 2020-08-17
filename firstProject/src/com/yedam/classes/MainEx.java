package com.yedam.classes;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		
		//1. 정보입력(이름, 나이, 전화번호)
		//2. 리스트
		//(3). 이름조회
		//(4). 이름조회 후 수정
		//9.종료
		FriendEx[] friends = new FriendEx[100]; //Friend 배열의 크기: 100
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		//메뉴출력
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.정보입력(이름,나이,전화번호) 2.리스트 9.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt(); scn.nextLine();
			//nextInt 뒤에는 scn.nextLine();를 붙여줘야 다음 입력으로 넘어감
			if(selectNo==1) {
				System.out.println("이름입력> ");
				String name = scn.nextLine();
				System.out.println("나이입력> ");
				int age = scn.nextInt(); scn.nextLine();
				System.out.println("전화번호입력> ");
				String phone = scn.nextLine();
				FriendEx f = new FriendEx(name, age, phone);
				//한 건만 입력해야함
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = f;
						break; //for 반복문 탈출
					}
				}
			}
			else if(selectNo==2) {
				for(FriendEx frnd : friends) {
					if(frnd != null) {
						System.out.println("이름: " + frnd.getName()
						+ ", 나이: " + frnd.getAge()
						+ ", 전화번호: " + frnd.getPhone());
					}
				}
			}
			else if(selectNo==9) {
			}
		}
		System.out.println("프로그램 종료.");
	} //end of main
} //end of class
