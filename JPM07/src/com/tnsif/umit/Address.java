package com.tnsif.umit;
//Contained Class
//Person Has Address | Has a relationship is a form of association | Main method execute in Executer.java

//Class Address
public class Address {  
	
	private String street;
	private String city;
	private String state;
	private String postalCode;
	
//Parameterize Constructor
	public Address(String street, String city, String state, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

//Generating Getter and Setter to access private data members
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
//No Args Constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
