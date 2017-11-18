package com.sware.general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;




public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		ArrayList<String>al2=new ArrayList<>();
		al2.add("Pramod");
		al2.add("Komal");
		al2.add("Manish");
		al2.add("Kiran");
		al2.add("Sachin");
		
		Iterator<String> itr=al2.iterator();
		
		while(itr.hasNext()){
			//itr.remove();// Throws IlegalStateException since we are trying romove element before moving to next element in the list.
			System.out.println(itr.next());
			itr.remove();// Works fine since iterator has moved to next element already.
		}
		
		System.out.println("list after"+al2);
		
		
	/*	al.add(new Student("Sachin",813,78));
		al.add(new Student("Akash",52,68));
		al.add(new Student("Tejas",782,72));
		al.add(new Student("Santosh",102,82));
		al.add(new Student("Amit",105,65));
		*/
		System.out.println(al);
		System.out.println(al2);
		Collections.sort(al2);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al2);
		
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		String str3="Hello";
		String str4="Hello";
		
		
		System.out.println(str1==str2);//+","+str1.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);//+","+str3.equals(str4));
		System.out.println(str3.equals(str4));
	}
}
