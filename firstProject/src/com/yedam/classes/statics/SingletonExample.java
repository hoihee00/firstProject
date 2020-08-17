package com.yedam.classes.statics;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if(s1 == s2) { //주소값 비교하면 항상 false 이지만 싱글톤으로 호출하면 s1과 s2가 동일한 주소값 가짐
			System.out.println("동일한 instance입니다.");			
		}
		else {
			System.out.println("다른 instance입니다.");
		}
	}

}
