package com.sware.general;

public class Person implements Cloneable {

	String name;
	int age;
	transient String gender;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public Object clone(){
		Object o=null;
		try {
			o= super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return o;
	}
	
}