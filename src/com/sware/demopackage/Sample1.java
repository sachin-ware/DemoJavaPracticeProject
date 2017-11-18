package com.sware.demopackage;

public class Sample1 {

	public Sample1() {
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		System.out.println("Show called");
		display();
	}
	
	public void display(){
		System.out.println("display called");
	}
	public static void main(String a[])
	{
		Sample1 s=new Sample1();
		s.show();
	}

}
