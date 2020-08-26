package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class CourseMain {

	public static void main(String[] args) {

		List<Course> list1 = new ArrayList<>();
		list1.add(new Course("자바", 2));
		list1.add(new Course("오라클", 3));

		List<Student> java = new ArrayList<>();
		java.add(new Student("김다희", 20, 50));
		java.add(new Student("박서준", 22, 48));
		java.add(new Student("송애기", 1, 12));
		
		List<Student> oracle = new ArrayList<>();
		oracle.add(new Student("전지현", 26, 50));
		oracle.add(new Student("이하늬", 25, 43));
		oracle.add(new Student("누구", 21, 25));

				
		
	} //end of main
} //end of class
