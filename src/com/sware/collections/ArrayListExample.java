package com.sware.collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String a[]){
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		int i=10;
		al.add("A1");
		al.add("A2");
		al.add("A3");
		al.add(i);
		System.out.println(al.size());
		System.out.println(al);
		
		
	}

}
