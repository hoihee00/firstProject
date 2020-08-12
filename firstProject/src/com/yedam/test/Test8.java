package com.yedam.test;

public class Test8 {

	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;

//		byte result1 = byteValue + byteValue;
//		System.out.println(result1);

		byte result1a = (byte) (byteValue + byteValue);
		System.out.println(result1a);

		int result2 = 5 + byteValue;
		System.out.println(result2);

		float result3 = 5 + floatValue;
		System.out.println(result3);

		double result4 = 5 + doubleValue;
		System.out.println(result4);

	}

}
