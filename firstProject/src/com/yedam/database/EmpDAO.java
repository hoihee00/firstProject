package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	//입력
	public void addEmployee(Employee emp) {
		Connection conn = DBConnection.getConnection();
// insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
// values(301, 'test', 'test', '2020-05-05', 'IT_PROG');
		String sql = "insert into emp_temp(employee_id, last_name, email, hire_date, job_id)"
		+ " values("+emp.getEmployeeId()+",\' "+emp.getLastName()+"\',\' "+emp.getEmail()+"\',\' "+emp.getHireDate()+"\',\' "+emp.getJobId()+"\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//조회
	public Employee[] getEmpList() {
		Connection conn = DBConnection.getConnection();
		Employee[] employees = new Employee[100]; //배열 크기는 초기 생성 이후 변경 불가능
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql); //여기에서 예외가 발생하면...
			ResultSet rs = pstmt.executeQuery();
			int idx = 0;
			while(rs.next()) { //가지고 올 값이 있는 동안 계속 값을 가지고 옴(true일 때)
				Employee emp = new Employee();
				String firstName = rs.getString("first_name"); //뒤에 "first_name" 내용은 DB의 컬럼
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				
				employees[idx++] = emp; // int idx = 0; 첫번째 인덱스에만 계속 값 채움 -> ++ 증가 처리
			}
			System.out.println(" -- end of data -- ");
		} catch (SQLException e) {
			e.printStackTrace(); //...이걸 실행
		}
		return employees;
		
	} //end of getEmpList()
	
	
	//수정
	public void updateEmp(int eId, int newsal) {
		Connection conn = DBConnection.getConnection();
// update employees
// SET salary = salary * 1.2
// where employee_id = 100;
		
		String sql = "update emp_temp set salary = " + newsal + "where employee_id = " + eId;
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//삭제
	public void removeEmp(int eId) {
		Connection conn = DBConnection.getConnection();
// delete emp_temp
// where employee_id = 200;
		
		String sql = "delete from emp_temp where employee_id = " + eId;
		System.out.println(sql);
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			System.out.println(r + " 건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
} //end of class
