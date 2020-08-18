package com.yedam.classes;

public class ComFriend extends Friend {
	
	private String comName;
	
	public ComFriend() {
		super();
	}

	public String getcomName() {
		return comName;
	}

	public void setcomName(String comName) {
		comName = comName;
	}
	
	@Override
	public String toString() {
		return "회사친구 이름: " + this.getName()
		+ ", 연락처: " + this.getPhone()
		+ ", 회사명: " + this.comName;
	}
	
}
