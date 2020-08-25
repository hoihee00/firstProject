package com.yedam.lambda;


	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	import com.yedam.collection.Member;

	public class BaseBall {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      boolean run = true;
	      
	      Scanner scn = new Scanner(System.in);
	      Set<Integer> basearray = new HashSet<>();

	         while(basearray.size()!=3) {
	            basearray.add((int) ((Math.random() * 9) + 1));
	         }
	         
	      
	      for (Integer i : basearray) {
	         System.out.println(i);
	      }

	      while (run) {
	         System.out.println("야구 게임 시작 임의의 숫자 입력 ");
	         System.out.print("첫번쨰 숫자 입력: ");
	         int firstnum = scn.nextInt();
	         System.out.print("두번쨰 숫자 입력: ");
	         int secondnum = scn.nextInt();
	         System.out.print("세번쨰 숫자 입력: ");
	         int thirdnum = scn.nextInt();
	         int count = 1;

	         String s1 = "";
	         String s2 = "";
	         String s3 = "";

	         for (Integer i : basearray) {

	            if (i == firstnum && count == 1) {
	               s1 = "s";
	               System.out.println(s1);
	            } else if (i == firstnum && count != 1) {
	               s1 = "b";
	               System.out.println(s1);
	            } else if (i == secondnum && count == 2) {
	               s2 = "s";
	               System.out.println(s2);
	            } else if (i == secondnum && count != 2) {
	               s2 = "b";
	               System.out.println(s2);
	            } else if (i == thirdnum && count == 3) {
	               s3 = "s";
	               System.out.println(s3);
	            } else if (i == thirdnum && count != 3) {
	               s3 = "b";
	               System.out.println(s3);
	            } else {
	               System.out.println("아 님!");
	            }
	            count++;
	            if (s1 == "s" && s2 == "s" && s3 == "s") {
	               System.out.println("스트라이크!!!!!!!! 게임 끝");
	               run =false;
	               break;
	            }

	         }

	      }

	   }
	}