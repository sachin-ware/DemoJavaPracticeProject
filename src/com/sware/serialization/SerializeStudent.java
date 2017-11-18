package com.sware.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeStudent {

	
	public static void serializeStudent(Student stud){
		try {
			FileOutputStream fos=new FileOutputStream("Student.ser");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(stud);
				oos.close();fos.close();
				
		} 
		catch (Exception e) {
			System.out.println("Exception while serialization:"+e.getMessage());
		}
	}
	
	public static Student de_serializeStudent(){
		Student s=null;
		try {
			FileInputStream fis=new FileInputStream("Student.ser");
				ObjectInputStream ois=new ObjectInputStream(fis);
				s=(Student)ois.readObject();
		} 
		catch (Exception e) {
			System.out.println("Exception while serialization:"+e.getMessage());
		}
		return s;
	}
	
	public static void main(String[] args) {
		Student stud=new Student("SachiN", 813, "9921685855", 26);
		System.out.println(stud.toString());
		SerializeStudent.serializeStudent(stud);
		
		Student deserilizedStud=SerializeStudent.de_serializeStudent();
		System.out.println(deserilizedStud.toString());
		
		
	}
}


class Student implements Serializable{
	String name;
	int rollNo;
	String contact;
	transient int age;//This variable will not be saved to file Student.ser since it is transient

	public Student(String name, int rollNo, String contact, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.contact = contact;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", contact=" + contact + ", age=" + age + "]";
	}
}
