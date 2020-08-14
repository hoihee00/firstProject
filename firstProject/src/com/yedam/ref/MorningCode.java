package com.yedam.ref;

public class MorningCode {

	public static void main(String[] args) {

		int[][] iAry = new int[5][5];
		int num1 = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				iAry[i][j] = num1++;
				System.out.printf("%3d", iAry[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.println("----------------");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", iAry[j][i]);
			}
			System.out.println();

		}
	}
}
