package com.sware.exceptions;

public class ExceptionDemo {

	public ExceptionDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			int n=10/0;
		} /*catch (Exception e) {
			System.out.println("exception caught");
		}*/
		finally{
			System.out.println("Finally");
		}
		
		System.out.println("After All"); 
		
	}

}
