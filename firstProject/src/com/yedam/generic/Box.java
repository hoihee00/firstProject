package com.yedam.generic;

public class Box<T> { //<T> 제네릭 : 클래스 선언 시점에 타입을 정함
	
	private T obj; //object(모든 타입의 최상위) 타입의 obj 필드
	
	public void set(T obj) { //set 메소드
		this.obj = obj;
	}
	
	public T get() {
		return this.obj;
	}
}
