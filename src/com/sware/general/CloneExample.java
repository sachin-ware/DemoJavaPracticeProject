package com.sware.general;

public class CloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Sachin",26);
		Person p3=(Person)p1.clone();
		Person p2=p1;
		p2.name="akash";
		System.out.println(p1==p3);
		
		System.out.println("Names:"+p1.toString()+" "+p2.toString()+" "+p3.toString());
				
	}

}
