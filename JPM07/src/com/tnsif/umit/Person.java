package com.tnsif.umit;
//Container Class(Address,Executor)
//Contained Class
//Person Has Address | Has a relationship is a form of association | Main method execute in Executer.java

//Class Person
public class Person {
	
	private String name;
	private Address address;
	
//Parameterize Constructor	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
//Generating Getter and Setter to access private data members
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	
//creating display Method to print the information 
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println(address.getStreet()+" "+ address.getCity()+" "+address.getState()+" "+address.getCity());
		
	}
	
	
	
}
