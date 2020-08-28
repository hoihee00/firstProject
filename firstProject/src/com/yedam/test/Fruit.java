package com.yedam.test;

public class Fruit {
	String fruit;
	int price;
	
	public Fruit(String fruit, int price) {
		this.fruit = fruit;
		this.price = price;
	}

	public Fruit() {
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{ " + fruit + ", " + price + " }";
	}
	
	
}
