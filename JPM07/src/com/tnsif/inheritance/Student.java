package com.tnsif.inheritance;

//Citizen is a Super class of Subclass Student and Execute in StudentCitizen.java

public class Student extends Citizen 
{
	private int rollNo;		//Defining variables along with private access specifier
	private String collegeName;
	
	public Student() {		//No Args Constructor
		super();
	}
	
	public Student(String name, String adharNo, String address, long phone, int rollNo, String collegeName) 		//Parameterize Constructor
	{
		super(name, adharNo, address, phone);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	//Generating Getter and Setter to access private data members
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}	

}
