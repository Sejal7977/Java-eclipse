package com.tnsif.inheritance;

//Employee is super class of Manager and main-method execute in Executor.java

public class Manager extends Employee{
	
	private int teamSize;		//Defining variables along with private access specifier
	

	//Parameterize Constructor
	public Manager(String name, int empNo, String department) {
		super(name, empNo, department);
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int empNo, String department, int teamSize) {
		super(name, empNo, department);
		this.teamSize = teamSize;
	}


	//Generating Getter and Setter to access private data members
	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "]";
	}
	
	
	
	
	
	

}
