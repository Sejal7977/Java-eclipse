package com.tnsif.umit;
//Performing to get the class of array and the getting familiar with 3-d array
public class arrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[100];
		float[][] arr1 = new float[100][100];
		System.out.println(arr.getClass().getName());
		System.out.println(arr1.getClass().getName());
		
		int[][][] x = {{{10,20,30}, {40,50,60}}, {{70,80}, {90,100,110}}};
		System.out.println(x[0][1][1]);
		System.out.println(x[0][1][2]);
		System.out.println(x[0][0][2]);

	}

}
