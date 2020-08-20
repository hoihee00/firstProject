package com.yedam.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행");
	}
}

class ChildAnonymous extends Anonymous {
	
}

interface AnonymInterface {
	void run(); //functional interface
}

public class AnonymousExample {
	public static void main(String[] args) {
		AnonymInterface anonymIntf = new AnonymInterface() { //익명 구현 객체 (-interface)

			@Override
			public void run() {
				System.out.println("자식 구현 객체 실행"); 
			}
			
		};
		anonymIntf.run();
		
		Anonymous anonym = new Anonymous() { // 익명 자식 객체 (-부모)
			String srt;
						
			@Override
			void run() {
				System.out.println("자식 실행"); 
			}
			
		};
		anonym.run();
	}
}
