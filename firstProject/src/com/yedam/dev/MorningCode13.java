package com.yedam.dev;

public class MorningCode13 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				continue;
			System.out.println(i);

		}
		int n = 0;
		while (true) {
			if (n++ == 5)
				break;
			else if (n == 3)
				continue;

			System.out.println("프로그램 진행 중...");
		}

		int j = 0;
		while (j < 10) {
			int i = 0;
			while (i < 10) {
				i++;
			}
			// i=10;

			int sum = 0;
			for (int k = 0; k < 10; k++) {
				sum = sum + k; // sum += 1;
				System.out.println(k);
			}

			int score = 90;
			if (score >= 90) {
				if (score >= 95)
					System.out.println("95 이상입니다.");
				else
					System.out.println("90 이상입니다.");
			} else if (score >= 80) {
				System.out.println("80 이상입니다.");
			} else {
				System.out.println("80 미만입니다.");
			}

		}
	}
}
