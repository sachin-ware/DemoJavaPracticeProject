package com.sware.general;

public class StringExample {
	public static void main(String[] args) {
		
		String s1="Amol";
		String s2="Amol";
		String s3=new String("Amol");
		String s4=new String("Amol");
		  final int arr1[] = {1, 2, 3, 4, 5};
	       int arr2[] = {10, 20, 30, 40, 50};
	       arr2 = arr1;      
	       //arr1 = arr2;  
	       for (int i = 0; i < arr2.length; i++)
	          System.out.println(arr2[i]);     
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
