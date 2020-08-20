package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		List<Student> list = new ArrayList<>();
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.입력 2.점수평균 3.수학최고점수 4.영어최고점수 5.조회 9.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();  scn.nextLine();

			if(selectNo == 1) {
				System.out.println("학생이름을 입력하시오");
				String name = scn.nextLine();
				System.out.println("수학점수를 입력하시오");
				int ms = scn.nextInt(); scn.nextLine();
				System.out.println("영어점수를 입력하시오");
				int es = scn.nextInt(); scn.nextLine();
				Student st = new Student(name, ms, es);
				
				list.add(st);

			}
			
			// 수학 평균, 영어 평균
			else if(selectNo == 2) {
				int sum1 = 0;
				int sum2 = 0;

				double mathavg = 0;
				double engavg = 0;
				
				for(int i = 0; i<list.size(); i++) {
					sum1 += list.get(i).getMathScore();
					sum2 += list.get(i).getEngScore();
				}
				mathavg = sum1/list.size();
				engavg = sum2/list.size();
				
				System.out.println("수학평균점수: " + mathavg + ", 영어평균점수: " + engavg);
			}
			
			// 수학 최고점수, 학생
			else if(selectNo == 3) {
				int maxIndex = 0;
				for(int i = 0; i < list.size(); i++) {
					if(list.get(maxIndex).getMathScore() < list.get(i).getMathScore())
						maxIndex = i;
				}
				
				System.out.println("수학최고점수: " + list.get(maxIndex).getMathScore() + ", 이름: " + list.get(maxIndex).getName());
				
			}
			
			// 영어 최고점수, 학생
			else if(selectNo == 4) {
				int maxValue=0;
				int maxIndex=0;
				for(int i = 0; i < list.size(); i++) {
					if(maxValue < list.get(i).getEngScore()) {
						maxValue = list.get(i).getEngScore();
						maxIndex = i;
					}
				}
				System.out.println("영어최고점수: " + list.get(maxIndex).getEngScore() + ", 이름: " + list.get(maxIndex).getName());
				}
			
			// 조회
			else if(selectNo == 5) {
				for(Student student : list) {
					System.out.println("이름: " + student.getName() + ", 수학점수: " + student.getMathScore() + ", 영어점수: " + student.getEngScore());
				}
			}
			else if(selectNo == 9) {
				run = false;
				System.out.println("종료");
			}
		}
		
		// 1) 학생이름, 수학점수, 영어점수를 입력받고 (3명)
		// 2) 수학평균, 영어평균을 계산하는 분석
		// 3) 수학최고점수와 학생을 보는 최고점수
		// 9) 종료
		// 프로그램을 작성하시오
		// ArrayList 사용

	}

}
