package com.yedam.test;

public class Math {
	public static int min (int a, int b) {
		int result = (a < b) ? a : b;
		return result;
	}
	
	public static double min (double a, double b) {
		double result1 = (a < b) ? a : b;
		return result1;
	}
	
	public static void main(String[] args) {
		
		int result = Math.min(39, 25);
		System.out.println("작은 수는: " + result);
		
		double result1 = Math.min(24.6, 3.8);
		System.out.println("작은 수는: " + result1);

	}
}
