package com.sware.general;

public interface StaticMethodInInterfaceDemo {
	static void show(){
		System.out.println("Show in interface is called");
	}
	
	default void defaultMethod1(){
		System.out.println("defaultMethod1 in interface is called");
	}
	default void defaultMethod2(){
		System.out.println("defaultMethod2 in interface is called");
	}
}


