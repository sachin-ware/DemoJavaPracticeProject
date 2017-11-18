package com.sware.general;

public class Student  implements Comparable<Student>{
	String name;
	int rolllNo;
	int marks;
	final int runs;

	public Student(String name, int rolllNo, int marks,int r) {
		this.name = name;
		this.rolllNo = rolllNo;
		this.marks = marks;
		this.runs=r;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rolllNo=" + rolllNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
}
