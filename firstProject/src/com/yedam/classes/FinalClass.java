package com.yedam.classes;

public class FinalClass {
	
	final int age = 10;
	
	public static void main(String[] args) {
		Friend fr = new Friend(); //인스턴스
		fr.getAge(); //인스턴스 메소드
		
//		Calulator cal = new Calulator();
		Calulator.add(10,10); //정적 메소드
		
		final int val = 10;
//		val =20;
		
		FinalClass ex2 = new FinalClass();
		ex2.age = 20;
	}

}
