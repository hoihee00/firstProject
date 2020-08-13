package com.yedam.ref;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b) {
			if (b > c) {
				System.out.println(a + ',' + b + ',' + c);
			} else {
				System.out.println(a + "," + c + "," + b);
			}
		}

		else if (b > a) {
			if (a > c) {
				System.out.println(b + "," + a + "," + c);
			}
			else {
				System.out.println(b + "," + c + "," + a);
			}
		}
		
		else if (a > c) {
			if (b > c) {
				System.out.println(a + "," + b + "," + c);
			}
			else {
				System.out.println(a + "," + c + "," + b);
			}
		}
		
		else if (a < c) {
			if (b > c) {
				System.out.println(b + "," + c + "," + a);
			}
			else {
				System.out.println(c + "," + b + "," + a);
			}
		}
		
		else if (b > c) {
			if (a > b) {
				System.out.println(a + "," + b + "," + c);
			}
			else {
				System.out.println(b + "," + c + "," + a);
			}
		}
		
		else if (b < c) {
			if (a > c) {
				System.out.println(a + "," + c + "," + b);
			}
			else
				System.out.println(c + "," + b + "," + a);			
		}

	}
}
