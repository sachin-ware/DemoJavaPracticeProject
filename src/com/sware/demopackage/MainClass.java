package com.sware.demopackage;

import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.soap.SAAJResult;
import com.sware.satara.Satara;


class Employee implements Cloneable{
	String name;
	Employee(String name){this.name=name;}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class MainClass extends Satara {
	
	String name="SachiN";
	int age=26;
	static int rank=2;
	
	public MainClass(){
		
	}
	public MainClass(String name, int age){
		this.age=age;
		this.name=name;
	}
	
	public void project(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+this.age);
		System.out.println("rank:"+this.rank);
		staticMenthodDemo();
	}
	
	public void show(){
		System.out.println();
		project();
	}
	
	public static void staticMenthodDemo(){
		System.out.println("Static method called");
		
	}
	
	public void setter(FriendClass frnd){
		frnd.name="Sachin";
		System.out.println("In Setter:"+frnd.name);
	}
	
	public static void main(String a[]) throws CloneNotSupportedException
	{
		/*Employee e1=new Employee("Sachin");
		System.out.println(e1.name);
		Employee e2=(Employee)e1.clone();
		System.out.println(e2.name);
		e2.name="Komal";
		System.out.println(e1.name);
		System.out.println(e2.name);
		
		Employee e3=e1;
		System.out.println(e1.name);
		e3.name="e3 akash";
		System.out.println(e1.name);
		System.out.println(e3.name);*/
		
		
		String aa=new String("AAA");
		String ss=aa;
		System.out.println(aa+","+ss);
		aa="Hello";
		System.out.println(aa+","+ss);
		//=new String("sss");
		
		
		
		
		
		
		
		
		
		
		
	}
}
