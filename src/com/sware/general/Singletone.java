package com.sware.general;

public class Singletone {
	
	private static Singletone singletone=null;
	private Singletone() {
		System.out.println("Classs instantiated . .");
	}
	
	public static Singletone getInstance()
	{
		if(singletone==null){
			singletone=new Singletone();
		}
		return singletone;
	}
	
	public void instanceMethod(){
		
		System.out.println("This is instance method of Singletone class");
	}
}
