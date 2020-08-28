package com.yedam.test;

public class Pet {
	String pName;
	int pAge;
	String pSex;
	
	public Pet(String pName, int pAge, String pSex) {
		super();
		this.pName = pName;
		this.pAge = pAge;
		this.pSex = pSex;
	}

	public Pet() {
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpSex() {
		return pSex;
	}

	public void setpSex(String pSex) {
		this.pSex = pSex;
	}

	@Override
	public String toString() {
		return "{ " + pName + ", " + pAge + ", " + pSex + " }";
	}
	
	

}
