package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김다희");
		p1.setAge(18);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person lgh = new Person();
		lgh.setName("이광호");
		lgh.setAge(40);
		System.out.println(lgh.getName());
		System.out.println(lgh.getAge());
//		System.out.println(lgh);
		
		Person kde = new Person();
		kde.setName("김도은");
		kde.setAge(21);
		System.out.println(kde.getName());
		System.out.println(kde.getAge());
//		System.out.println(kde);
		
		Person queen = new Person();
		queen.setName("전지현");
		queen.setAge(30);
		Person queen2 = new Person();
		queen2.setName("전지현");
		queen2.setAge(30);
		System.out.println(queen.getName());
		System.out.println(queen.getName() == queen2.getName());
		System.out.println(queen.getAge());
//		System.out.println(queen);
		
		System.out.println(lgh.introduce());
		System.out.println(kde.introduce());
		System.out.println(queen.introduce());
		
		Person[] pAry = {lgh, kde, queen, queen2};
		
//		for(int i=0; i<pAry.length; i++) {
//			pAry[i].introduce();
//		}
		
		Person anoy = new Person("원빈");
		anoy.name = "박서준";
		anoy.age = 32;
		System.out.println(anoy.introduce());
		
		Person sky = new Person("현빈", 31);
		sky.setName("강하늘");
		System.out.println(sky.introduce());
		

	}

}
