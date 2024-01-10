package com.tnsif.inheritance;

//Class Employee is a super class of Manager and main-method execute in Executor.java

public class Employee {
	
	private String name;
	private int empNo;
	private String department;
	
	public Employee() { 	//No Args Constructor
		super();
	}

	public Employee(String name, int empNo, String department) {		//Parameterize Constructor
		super();
		this.name = name;
		this.empNo = empNo;
		this.department = department;
	}
	
	//Generating Getter and Setter to access private data members

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", department=" + department + "]";
	}
	
	

}
