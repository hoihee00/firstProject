package com.yedam.generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class GenericExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("박서준");
		set.add("강하늘");
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("박보검", 50);
		map.put("최재영", 43);
		
	}

}
