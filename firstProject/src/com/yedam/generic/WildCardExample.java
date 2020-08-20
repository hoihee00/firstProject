package com.yedam.generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// <?> 와일드카드-모든 타입의 class를 다 받겠다는 의미
		
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		// <? extends Student> Student class이거나 Student class를 상속받는 하위 class만 받음
		// Course<Student>, Course<HighStudent>
		
	}
	
	 public static void registerCourseWorker(Course<? super Worker> course) {
		 // <? super Worker> worker class이거나 그 상위 class만 받음
		 // Course<Worker>, Course<Person>
		 
	 }
	
	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//		crsWorker.add(new Person("일반인2"));
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생과정", 5);
		crsStudent.add(new Student("학생2"));
		crsStudent.add(new HighStudent("고등학생2"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsHighStudent.add(new HighStudent("고등학생3"));

		// 일반인 등록 가능 Course<?>
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);


		// 직장인 등록 가능 Course<? super Worker>
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsWorker);
//		registerCourseWorker(crsStudent); // Worker 클래스의 상위 클래스가 아니라서 타입이 맞지 않음 - 사용 불가
//		registerCourseWorker(crsHighStudent); // Worker 클래스의 상위 클래스가 아니라서 타입이 맞지 않음 - 사용 불가

		
		// 학생 등록 가능 Course<? extends Student>
//		registerCourseStudent(crsPerson); // Student 클래스의 하위 클래스가 아니라서 타입이 맞지 않음 - 사용 불가
//		registerCourseStudent(crsWorker); // Student 클래스의 하위 클래스가 아니라서 타입이 맞지 않음 - 사용 불가
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);

		// 고등학생 등록 가능
	}

}
