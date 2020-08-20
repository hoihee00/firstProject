package com.yedam.collection;

//com.yedam.classes.exam.Member
//com.yedam.Collection.Member

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) { //생성자
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { //getName 메소드
		return name;
	}

	public int getAge() { //getAge 메소드
		return age;
	}
	
	
	//hashcode, equals 활용, 논리적으로 동일한 객체

	@Override
	public int hashCode() {
		return this.name.hashCode();
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
	}
	

	
}
