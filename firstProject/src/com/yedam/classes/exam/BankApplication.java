package com.yedam.classes.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt(); scn.nextLine();
			
			if(selectNo == 1) {
				createAccount();
			}
					
			else if(selectNo == 2) {
				accountList();
			}
					
			else if(selectNo == 3) {
				deposit();
			}
					
			else if(selectNo == 4) {
				withdraw();
			}
					
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
////////////
	
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("계좌주: ");
		String owner = scn.nextLine();
		System.out.println("초기입금액: ");
		int balance = scn.nextInt(); scn.nextLine();
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		Account b = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = b;
				break;
				}
		}
	}
			
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(Account ac : accountArray) {
			if(ac != null) {
				System.out.println("계좌번호: " + ac.getAno()
				+ ", 계좌주: " + ac.getOwner()
				+ ", 잔액: " + ac.getBalance());
			}
		}
	}
	
	private static void deposit() { //입금
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("예금액: ");
		int mm = scn.nextInt(); scn.nextLine();
		
		Account ad = findAccount(ano);
		ad.setBalance(ad.getBalance()+mm);
		}
	
	private static void withdraw() { //출금
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.println("계좌번호: ");
		String ano = scn.nextLine();
		System.out.println("출금액: ");
		int mm = scn.nextInt(); scn.nextLine();
		
		Account ad = findAccount(ano);
		if(ad.getBalance()>mm)
			ad.setBalance(ad.getBalance()-mm);
		else
			System.out.println("출금 가능액을 초과하였습니다.");
	}
	
	private static Account findAccount(String ano) {
		Account searchAc = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] !=null) {
				if(accountArray[i].getAno().equals(ano))
					searchAc = accountArray[i];
				
	         }
	                  
	      }
	      
	      return searchAc; 
	}
}
