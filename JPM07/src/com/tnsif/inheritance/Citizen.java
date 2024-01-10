package com.tnsif.inheritance;

//Citizen is a Super class of Subclass Student and Execute in StudentCitizen.java

public class Citizen {
	
	private String name;  //Defining Four variables along with private access specifier
	private String adharNo;
	private String address;
	private long phone;
	
	public Citizen() {		//No Args Constructor
		super();
	}

	public Citizen(String name, String adharNo, String address, long phone) {		//Parameterize Constructor
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}

	//Generating Getter and Setter to access private data members
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	

}
