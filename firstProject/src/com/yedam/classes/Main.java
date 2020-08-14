package com.yedam.classes;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setNum(111);
		s1.setName("홍길동");
		s1.setMajor("역사");
		System.out.println("학번: " + s1.getNum() + " / 이름: " + s1.getName() + " / 전공: " + s1.getMajor());
		
		Student s2 = new Student(222, "김유신", "승마");
		System.out.println("학번: " + (int)s2.num + " / 이름: " + (String)s2.name + " / 전공: " + (String)s2.major);

		Student s3 = new Student(21012322, "김다희", "역사");
		
		System.out.println("학번: " + (int)s3.num + " / 이름: " + (String)s3.name + " / 전공: " + (String)s3.major);
		
		Student s4 = new Student(456, "이광호", "자바");
		System.out.println("학번: " + (int)s4.num + " / 이름: " + (String)s4.name + " / 전공: " + (String)s4.major);
		
		Student s5 = new Student(789, "김도은", "승마");
		System.out.println("학번: " + (int)s5.num + " / 이름: " + (String)s5.name + " / 전공: " + (String)s5.major);
		
		Student[] stuAry = new Student[5];
		stuAry[0] = s1;
		stuAry[1] = s2;
		stuAry[2] = s3;
		stuAry[3] = s4;
		stuAry[4] = s5;
		
		String searchName = "김유신"; // 김유신 찾기
		String searchMajor = "역사";
		/////////////////////////////////////
		int val1 = 111;
		String val2 = "김도은";
		String val3 = "자바";
		
//		Student s4 = null;
		Student s7 = new Student(val1, val2, val3);
		s7.setNum(val1);
		s7.setName(val2);
		s7.setMajor(val3);

		Student[] sAry = {s1, s2, s3, s4, s5};
		for(Student s : sAry) {
			if(s.getName().equals("searchName") || s.getMajor().equals(searchMajor))
			System.out.println(s); // 주소값 출력됨
		}
		
		
		
// 메인메소드 111 홍길동 역사, 222 김유신 말타기
// 배열에 저장 studAry
		
	}

}
