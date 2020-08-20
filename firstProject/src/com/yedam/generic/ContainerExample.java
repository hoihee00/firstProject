package com.yedam.generic;

public class ContainerExample {
	
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
//		container1.setKey("홍길동");
//		container1.setValue("도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
//		container2.setKey("홍길동");
//		container2.setValue(35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
	}
	
}
