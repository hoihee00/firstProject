package com.yedam.database;

public class EmpServiceImpl implements EmpService{
	
	EmpDAO dao = new EmpDAO();

	@Override
	public Employee[] showList() {
		return dao.getEmpList();
	}

	@Override
	public void addEmp(Employee emp) {
		dao.addEmployee(emp);
	}

	@Override
	public void modEmp(Employee emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void delEmp(int eId) {
		dao.removeEmp(eId);
	}
	

}
