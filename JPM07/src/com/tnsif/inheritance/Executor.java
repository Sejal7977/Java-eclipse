package com.tnsif.inheritance;


public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Sejal",101,"Google");  //Creating and initializing new object employee
		Manager manager = new Manager("Sejal",101,"Google",2);   //Creating new initializing new object manager
		
		System.out.println(employee); //print the output
		System.out.println(manager);
	}
}
