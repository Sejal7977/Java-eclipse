package com.tnsif.umit;
//built-in method of java
public class stringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Ratnagiri");
		System.out.println(s.toUpperCase()); //To convert string into Upper case
		System.out.println(s.toLowerCase()); //To convert string into Lower case
		
		System.out.println(s.replace('a', 'A'));
		String s2 = "Ratnagiri";
		System.out.println(s.equals(s2));   //Output in boolean to compare the string
		System.out.println(s.substring(5)); //Returns a string that is a substring of this string from the given location
		System.out.println(s.substring(1, 3)); //Returns a string that is a substring of this string from the start location to upto end location

	}

}
