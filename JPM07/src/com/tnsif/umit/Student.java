package com.tnsif.umit;
//Performing to study the concept of arrays as a object using Data members of class Student
//Execute at Driver.java

public class Student {
	
	private String name; ////Defining two variables along with private access specifier
	private int rollno;
	
//Parameterize Constructor
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

//Generating Getter and Setter to access private data members
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
