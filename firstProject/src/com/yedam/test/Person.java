package com.yedam.test;

import java.util.Arrays;

public class Person {
	String name;
	int age;
	Pet pet[];
	Fruit fruit[];
	
	public Person(String name, int age, Pet[] pet, Fruit[] fruit) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
		this.fruit = fruit;
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

	public void setAge(int age) {
		this.age = age;
	}

	public Pet[] getPet() {
		return pet;
	}

	public void setPet(Pet[] pet) {
		this.pet = pet;
	}

	public Fruit[] getFruit() {
		return fruit;
	}

	public void setFruit(Fruit[] fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + Arrays.toString(pet) + ", " + Arrays.toString(fruit);
	}
	
	
	
}
