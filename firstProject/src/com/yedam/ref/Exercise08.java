package com.yedam.ref;

public class Exercise08 {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				sum += array[i][j];
				count++;
			}

		}
		avg = (double) sum / count;
		System.out.println("합계: " + sum + ", 평균: " + avg);

	} // main
} // class
