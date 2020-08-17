package com.yedam.inherit;

public class Child extends Parent { //extends Parent : 부모 클래스를 상속받음
	private int grade;
	
	public Child(String name, int age) { //name과 age 필드는 따로 선언하지 않음
		super(name, age);
	}
	
	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade; //grade 메소드 선언
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}
