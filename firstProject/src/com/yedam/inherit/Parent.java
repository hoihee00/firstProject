package com.yedam.inherit;

public class Parent extends Object {
	//모든 클래스는 기본적으로 Object 클래스를 상속받고 있음 (extends Object 생략)

	private String name;
	private int age;
	
	public Parent () {
		
	}
	
	public Parent(String name, int age) {
		super();//부모클래스의 생성자 호출
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
	return "Parent [name=" + name + ", age= " + age + "]";
	}

}
