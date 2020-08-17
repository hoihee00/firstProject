package com.yedam.inherit;

public class Vehicle {
	void run() {
		System.out.println("차량이 달립니다.");

	}

}

class Bus extends Vehicle {

	@Override
	void run() {
		super.run(); //부모 클래스가 가진 run을 호출
		System.out.println("버스가 달립니다.");
	}
}


class Taxi extends Vehicle {

	@Override
	void run() {
		super.run(); //부모 클래스가 가진 run을 호출
		System.out.println("택시가 달립니다.");
	}
}