package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample {
	Member mem;
	class Member {
		String id;
		Member(String id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {
//			return super.equals(obj);
			if(obj instanceof Member) {
				Member mem = (Member) obj;
				return id.equals(mem.id);
			}
			else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			return Objects.hash(id); //id 값이 같으면 동일한 해시코드
//			return super.hashCode();
		}	
	}
	
	public static void main(String[] args) {
		NewExample ne = new NewExample();
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2));
		
		System.out.println(Objects.hash(11));
		System.out.println(Objects.hash("hhh"));
		
		Set<Member> set = new HashSet<>(); // set 컬렉션은 중복값은 받아들이지 않음
		set.add(m1);
		set.add(m2); //중복값이라서 제외됨
		for (Member m : set) {
			System.out.println(m.id);
		}
		
	}
}
