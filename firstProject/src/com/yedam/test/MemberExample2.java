package com.yedam.test;

import java.util.Arrays;

public class MemberExample2 {
	class Member implements Cloneable {
		public String name;
		public int age;
		public int[] scores;
		public Car car;
		
		public Member(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}
		
		// clone() 메소드 재정의
		@Override
		protected Object clone() throws CloneNotSupportedException {
			//먼저 얕은 복사를 해서 name, age를 복제한다.
			Member cloned = (Member) super.clone(); // Object의 clone() 호출
			//scores를 깊은 복제한다.
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			//car를 깊은 복제한다.
			cloned.car = new Car(this.car.model);
			//깊은 복제된 Member 객체를 리턴
			return cloned;
		}
		
		public Member getMember() {
			Member cloned = null;
			try {
				cloned = (Member) clone(); // 재정의된 clone() 메소드 호출
			}
			catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return cloned;
		}
	} //end of Member class
	
	public class Car {
		public String model;
		public Car(String model) {
			this.model =model;
			}
		}

	public static void main(String[] args) {
		MemberExample2 me2 = new MemberExample2();

		//원본 객체 생성
		Member original = me2.new Member("홍길동", 25, new int[] {90,90}, me2.new Car("소나타"));

		//복제 객체를 얻은 후에 참고 객체의 값을 변경
		Member cloned = original.getMember();
	    cloned.scores[0] = 100;
	    cloned.car.model = "그랜져";
	      
	    System.out.println("[복제 객체의 필드값]");
	    System.out.println("name: "+ cloned.name);
	    System.out.println("name: "+ cloned.age);
	    System.out.print("scores: {");
	      
	    for(int i=0;i<cloned.scores.length;i++) {
	    	System.out.print(cloned.scores[i]);
	        System.out.print((i==(cloned.scores.length-1))?"":",");
	        }
	    System.out.println("}");
	    System.out.println("car: "+cloned.car.model);
	    System.out.println();
	      
	    System.out.println("[원본 객체의 필드값]");
	    System.out.println("name: "+original.name);
	    System.out.println("age: "+original.age);
	    System.out.print("scores: {");
	    for(int i=0; i<original.scores.length; i++) {
	    	System.out.print(original.scores[i]);
	        System.out.print((i==(original.scores.length-1))?"":",");
	        }
	    System.out.println("}");
	    System.out.println("car: " + original.car.model);
	    }
	}
