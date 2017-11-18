package com.sware.general;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		try {

			MCAStudent s1=new MCAStudent(new String("sachin"),1);
			MCAStudent s2=new MCAStudent(new String("sachin"),1);
			MCAStudent s3=new MCAStudent("Pooja",10);
			MCAStudent s4=new MCAStudent("Pooja",10);
			MCAStudent s5=new MCAStudent("Kiran", 15);
			MCAStudent s6=new MCAStudent("Pooja",24);
			MCAStudent s7=new MCAStudent("Goga",10);
			
			Set<MCAStudent> set=new HashSet<>();
			
			set.add(s1);
			set.add(s2);
			set.add(s3);
			set.add(s4);
			set.add(s5);
			set.add(s6);
			
			//set.add(new MCAStudent("Pooja",10));
			//set.add(new MCAStudent("Akash",11));
			//set.add(new MCAStudent("Pooja",10));
			
			for(MCAStudent s:set){
				System.out.println("Name:"+s.name);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class MCAStudent{
	
	String name;
	int rollno;
	public MCAStudent(String n, int r){
		this.name=n;this.rollno=r;
	}
	
	@Override
	public boolean equals(Object o){
		
		if((o instanceof MCAStudent) && (this.name.equals(((MCAStudent)o).name))){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		int tmp=this.rollno;
		int hashcode=0;
		while(tmp!=0){
			hashcode=hashcode+(tmp%10);
			tmp=tmp/10;
		}
		return hashcode;
	}
}
