package com.sware.general;

public class Sample implements StaticMethodInInterfaceDemo,Interface2 {

	
	public static void main(String[] args) throws ClassNotFoundException {
	//	Singletone sing=Singletone.getInstance();
		//Singletone sign= new Singletone("sachin");
		//sing.instanceMethod();
		Class<?> obj=Class.forName("com.sware.general.Singletone");
		System.out.println(obj.getName());
		//System.out.println(obj instanceof Singletone);
		//System.out.println("Hello");
		
		StaticMethodInInterfaceDemo.show();
		Sample s=new Sample();
		s.defaultMethod1();
		s.defaultMethod2();
	}

	@Override
	public void defaultMethod1() {
		// TODO Auto-generated method stub
		StaticMethodInInterfaceDemo.super.defaultMethod1();
	}

	/*@Override
	public void defaultMethod1() {
		// TODO Auto-generated method stub
		Interface2.super.defaultMethod1();
	}*/

}
