package com.yedam.inherit;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child("홍길동", 15, 10);
		child.getName(); //부모에게 받은 getName()
		child.getAge(); //부모에게 받은 getAge()
		child.getGrade(); //자신 getGrade

		Parent parent = new Child("김유신", 20, 20);
		parent.getName();
		parent.getAge();
//		parent.getGrade(); //자식이 가진 메소드는 호출할 수 없음

		Vehicle v1 = new Taxi();
		v1.run(); //오버라이딩
		v1 = new Bus();
		v1.run(); //오버라이딩
		
		Driver driver = new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1 = new Parent();
		System.out.println(parent1.toString());
	}
}
