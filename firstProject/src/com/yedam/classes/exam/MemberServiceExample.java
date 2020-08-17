package com.yedam.classes.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		// 로그인 정보
		Member mem1 = new Member("홍길동", "hong");
		mem1.setPassword("hong123");

		MemberService mService = new MemberService();
		boolean result = mService.login(mem1.getId(), mem1.getPassword());
		if (result) {
			System.out.println(mem1.getName() + "님 로그인 되었습니다.");
		}
		else {
			System.out.println("id 또는 password를 확인하세요.");
		}
	}
}