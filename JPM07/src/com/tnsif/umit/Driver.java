package com.tnsif.umit;
//Executing Class Student.java

public class Driver {
	
	public static void main(String[] args) {
		
		Student[] arr=new Student[5];  //Creating new initializing new object Array arr
		arr[0]=new Student("Sejal",101);
		arr[1]=new Student("Tanvi",102);
		arr[2]=new Student("Kiara",103);
		arr[3]=new Student("Alia",104);
		arr[4]=new Student("Lata",105);
		
		for(int i=0; i<arr.length; i++) //printing the array
		{
			System.out.println(arr[i]);
		}
		
	}

}
