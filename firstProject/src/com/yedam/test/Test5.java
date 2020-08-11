package com.yedam.test;

public class Test5 {

	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';

		int intValue1 = byteValue;
		System.out.println(intValue1);

		int intValue2 = charValue;
		System.out.println(intValue2);
		
//		short shortValue = charValue;
//		System.out.println(shortValue);

		short shortValue = (short) charValue;
		System.out.println(shortValue);

		double doubleValue = byteValue;
		System.out.println(doubleValue);

	}

}
