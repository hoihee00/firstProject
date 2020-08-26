package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String title;
	private int number;
	
	List<Course> list = new ArrayList<>();
	
	public Course(String title, int number) {
		this.title = title;
		this.number = number;
		
	}
	
	public void course(Course s) {
		if(list.size() < number) {
			list.add(s);
		}	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "과정명:" + title + ", 정원:" + number;
	}
	
	
	
}
