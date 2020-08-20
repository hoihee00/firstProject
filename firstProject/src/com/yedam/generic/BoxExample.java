package com.yedam.generic;

import com.yedam.classes.Person;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>(); //T위치에 String
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
		Person p1 = box2.get(); //잘못된 타입이 들어가면 에러 표시해줌
		
		Box<Person> box3 = Utils.boxing(new Person());
		
		Box<String> box4 = Utils.boxing(new String("hhh"));
		
//		Box box = new Box();
//		String str1 = new String("Hello");
//		box.set(str1);
//		String result = (String) box.get(); //부모인 Object 타입 리턴 -> String 타입으로 형변환
//
//		Person p1 = new Person(); //다른 패키지에 있는 클래스라서 import 해줌
//		box.set(p1);
//		Person p2 = (Person) box.get();
//		
//		result = (String) box.get(); //runtime error 발생
		
	}
}
