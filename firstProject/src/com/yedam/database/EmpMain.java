package com.yedam.database;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int selectNo = 0;
			
			try {
				selectNo = scn.nextInt();
				
			} catch(InputMismatchException e){
				System.out.println("숫자만 입력하시오 제발");
				scn.nextLine(); 
				continue;
			}
			
			
			if(selectNo == 1) {
//				EmpDAO dao = new EmpDAO();
				Employee[] emps = service.showList();
				for (Employee emp : emps) {
					if(emp != null)
						System.out.println(emp.toString());
				}
			}
			
			else if(selectNo == 2) {
//				EmpDAO dao = new EmpDAO();
				
				System.out.println("사번 입력> ");
				int ei = scn.nextInt(); scn.nextLine();
				System.out.println("이름 입력> ");
				String ln = scn.nextLine();
				System.out.println("메일 입력> ");
				String em = scn.nextLine();
				System.out.println("입사일 입력> ");
				String hd = scn.nextLine();
				System.out.println("업무 입력> ");
				String ji = scn.nextLine();
				
				Employee emp = new Employee();
				emp.setEmployeeId(ei);
				emp.setLastName(ln);
				emp.setEmail(em);
				emp.setHireDate(hd);
				emp.setJobId(ji);
				
//				Employee emp = new Employee(333,"test","test","2020-05-05","IT_PROG");
				service.addEmp(emp);
			}
			
			else if(selectNo == 3) {
				System.out.println("수정할 사번 입력> ");
				int eId = scn.nextInt(); scn.nextLine();
				System.out.println("수정할 급여 입력> ");
				int newsal = scn.nextInt();
				Employee emp = new Employee();
				emp.setSalary(newsal);
				emp.setEmployeeId(eId);
//				EmpDAO dao = new EmpDAO();
				service.modEmp(emp);
				
			}
			
			else if(selectNo == 4) {
				System.out.println("삭제할 사번 입력> ");
				int eId = scn.nextInt(); scn.nextLine();
//				EmpDAO dao = new EmpDAO();
				service.delEmp(eId);
			}
			
			else if(selectNo == 9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	

}
