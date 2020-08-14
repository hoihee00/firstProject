package com.yedam.classes;

public class Person { // Person이라는 클래스 선언
	String name; // 필드
	int age;
	// 생성자 (생성자는 해당되는 필드를 초기화할때 사용)
	public Person() { // 매개값이 없는 생성자 : 기본생성자 (default Constructor)
//		name = "anonymous";
//		age = 10;
		
	}
	public Person(String name) { // 매개값이 있는 Person 생성자
		this.name = name; // this: 매개값의 name과 필드의 name 구분을 위해 사용
		// this: 만들어진 instance에 해당하는 필드를 지칭함
		
	}
	public Person(String name, int age) { // 매개값이 있는 Person 생성자
		this.name = name;
		this.age = age;
		
	}
	// 메소드
	public String introduce() { // pulic + 반환 타입 + introduce 
		return "이름은 " + name + ", 나이는 " + age ;
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

	public void setAge(int age) { // void 반환값이 없음
		this.age = age;
	}

}
