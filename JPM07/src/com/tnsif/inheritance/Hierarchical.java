package com.tnsif.inheritance;

//hierarchical inheritance example

//Base class
class Employees {
 String name;
 int employeeId;

 // Constructor
 Employees(String name, int employeeId) {
     this.name = name;
     this.employeeId = employeeId;
 }

 // Method
 void displayDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
 }
}

//Derived class 1
class Managers extends Employees {
 String department;

 // Constructor
 Managers(String name, int employeeId, String department) {
     super(name, employeeId);
     this.department = department;
 }

 // Additional method
 void manageTeam() {
     System.out.println(name + " is managing the " + department + " team.");
 }
}

//Derived class 2
class Developer extends Employees {
 String programmingLanguage;

 // Constructor
 Developer(String name, int employeeId, String programmingLanguage) {
     super(name, employeeId);
     this.programmingLanguage = programmingLanguage;
 }

 // Additional method
 void writeCode() {
     System.out.println(name + " is writing code in " + programmingLanguage + ".");
 }
}


public class Hierarchical {
	public static void main(String[] args) {
	     // Create objects of the derived classes
	     Managers manager = new Managers("John Doe", 101, "Engineering");
	     Developer developer = new Developer("Alice Smith", 102, "Java");

	     // Access methods and variables from the base class Employee and Access methods and variables from the derived classes
	     manager.displayDetails();
	     manager.manageTeam();
	     
	     System.out.println("\n");	     
	     
	     developer.displayDetails();
	     developer.writeCode();
	 }

}
