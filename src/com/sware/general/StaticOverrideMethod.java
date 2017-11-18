package com.sware.general;



class Parent{
	String name;
	public Parent(){
		
	}
	public Parent(String name){
		this.name=name;
	}
	public static void show(){
		System.out.println("Parent Show");
	}
	public void display(){
		System.out.println("Parent Display");
	}
}

public class StaticOverrideMethod extends Parent{

		
		public static void show(){
			System.out.println("Child show");
		}
		
		public void display(){
			System.out.println("Child Display");
		}
		
		//Overloading with upcasting
		public long add(long a,long b){
			System.out.println("Long Add:"+a+b);
			return a+b;
		}
		
		/*public void add(int a,int b){
			System.out.println("int Add:"+a+b);
		}
		
		public void add(short a,short b){
			System.out.println("short Add:"+a+b);
		}*/
		
		static void m(int i){System.out.println("int");}  
		static void m(Integer i){System.out.println("Integer");} 
		  
		public static void main(String[] args) {
			Parent parent=new Parent();
			Parent child=new StaticOverrideMethod();
			StaticOverrideMethod childself=new StaticOverrideMethod();
			
			parent.show();
			child.show();
			childself.show();
			
			parent.display();
			child.display();
			childself.display();
			
			short c=10,d=20;
			Long p=30L,q=40L;
			int res=(int)childself.add(50,60);
			System.out.println(res);
			childself.add(c,d);
			childself.add(q,p);
			
			System.out.println("--------------------------");
			
			Integer shortInt=5;
			StaticOverrideMethod.m(10);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}


