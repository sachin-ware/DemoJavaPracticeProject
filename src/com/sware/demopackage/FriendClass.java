package com.sware.demopackage;

public class FriendClass {
	
	public String name="SOURABH";
	protected int age=25;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void showData(){
		System.out.println("Friend name:"+name);
		System.out.println("Friend age:"+age);
	}

	public FriendClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
