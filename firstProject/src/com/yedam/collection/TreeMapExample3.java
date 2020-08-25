package com.yedam.collection;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<Student, String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69, 79), "체육특기생");
		tMap.put(new Student("Park", 78, 88), "일반학생");
		tMap.put(new Student("Choi", 85, 79), "체육특기생");
		tMap.put(new Student("Kim", 90, 86), "일반학생");
		
//		tMap.headMap(toKey) // 80점 이하
		SortedMap<Student, String> sMap = tMap.headMap(new Student("Base", 80, 88));
		Set<Student> set = sMap.keySet();
		for (Student s : set) {
			System.out.println(s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		
		
//		tMap.tailMap(fromKey) //80점 이상
		SortedMap<Student, String> sMap2 = tMap.tailMap(new Student("Base", 80, 88));
		Set<Student> set2 = sMap2.keySet();
		for (Student s : set2) {
			System.out.println(s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}
		
//		tMap.subMap(fromKey, toKey) //70~80점 사이
		SortedMap<Student, String> sMap3 = tMap.subMap(new Student("Base", 70, 88), new Student("Base", 80, 88));
		Set<Student> set3 = sMap3.keySet();
		for (Student s : set3) {
			System.out.println(s.getName() + ", " + s.getMathScore() + ", " + s.getEngScore());
		}

	}
}
