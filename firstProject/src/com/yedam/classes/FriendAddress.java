package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	public static void main(String[] args) {
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학교친구 2.회사친구 3.친구 4.리스트 9.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt(); scn.nextLine();
			if(selectNo == 1) {
				addUnivFriend();
			}
			else if(selectNo == 2) {
				addComFriend();
			}
			else if(selectNo == 3) {
				addFriend();
			}
			else if(selectNo == 4) {
				friendList();
			}
			else if(selectNo == 9) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
	} //end of main
	
	//리스트 조회 메소드
	public static void friendList() {
		for(Friend friend : friends) {
			if(friend !=null)
				System.out.println(friend.toString());
		}
	}
	
	//친구 등록 메소드
	public static void addFriend() {
	System.out.println("그외친구등록");
	System.out.println("이름입력> ");
	String name = scn.nextLine();
	System.out.println("전화번호입력> ");
	String phone = scn.nextLine();
	
	Friend friend = new Friend();
	friend.setName(name);
	friend.setPhone(phone);
	
	for(int i=0; i<friends.length; i++) {
		if(friends[i] == null) {
			friends[i] = friend;
			break;
		}
	}
	System.out.println("-- 입력 완료 --");
}

	// 회사 친구 등록 메소드
	public static void addComFriend() {
		System.out.println("회사친구등록");
		System.out.println("이름입력> ");
		String name = scn.nextLine();
		System.out.println("전화번호입력> ");
		String phone = scn.nextLine();
		System.out.println("회사명입력> ");
		String comName = scn.nextLine();
		
		ComFriend friend = new ComFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setcomName(comName);
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("-- 입력 완료 --");
	}
	
	// 학교 친구 등록 메소드
	public static void addUnivFriend() {
		System.out.println("학교친구등록");
		System.out.println("이름입력> ");
		String name = scn.nextLine();
		System.out.println("전화번호입력> ");
		String phone = scn.nextLine();
		System.out.println("전공입력> ");
		String major = scn.nextLine();
		
		UnivFriend friend = new UnivFriend();
		friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("-- 입력 완료 --");
	}
	
} //end of class
