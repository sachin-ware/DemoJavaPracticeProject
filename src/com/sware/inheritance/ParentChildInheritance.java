package com.sware.inheritance;


class Parent{
	 void method1(){
		System.out.println("Parent method1");
	}
}


class Child extends Parent{
	protected void method1(){
		System.out.println("Parent method1");
	}
	 
	 public static void main(String[] args) {
		 Child obj=new Child();
			obj.method1();

		}
}

public class ParentChildInheritance {

	

}
