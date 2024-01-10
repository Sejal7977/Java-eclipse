package com.tnsif.umit;
//Contained Class
//Person Has Address | Has a relationship is a form of association | Main method execute in Executer.java

//Class Executor to execute object
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("Vijay Chowk", "Mumbai","MH", "400005"); //Creating new initializing new object address
		Person person = new Person("Srilatha",address); //Creating new initializing new object person
		person.display(); //Calling the method display
	}

}
