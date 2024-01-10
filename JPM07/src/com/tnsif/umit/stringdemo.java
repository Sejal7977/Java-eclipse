package com.tnsif.umit;
//Performing to getting familiar with String and StringBuffer
public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Avantika");
		String newString=s.concat("Tiwari");
		
		System.out.println(s);
		System.out.println(newString);
		
		StringBuffer s1 = new StringBuffer("Sejal"); //Constructs a string buffer initialized to the contents of the specified string
		s1.append("Jadhav");
		System.out.println(s1);

	}

}
