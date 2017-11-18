package com.sware.general;

public class Inheritance {

	public static void main(String[] args) {
		Car myCar=new EcoSports();
		EcoSports sp=new EcoSports();
		Car fordCar= new FordCar( ) {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void breaking() {
				// TODO Auto-generated method stub
				
			}
		};
		myCar.run();
		System.out.println(myCar.name);
		System.out.println(sp.name);
		
	}

}


interface Car{
	String name="Car interface";
	void run();
	
}

abstract class FordCar implements Car{
	public void engineSoud(){
		System.out.println("Silent sound");
	}
	abstract void breaking();
}

class EcoSports extends FordCar{

	@Override
	public void run() {
		System.out.println("running at 150 miles/hr");
	}

	@Override
	void breaking() {
		System.out.println("Hydrolic Breaks with ABS");
		
	}
	
}