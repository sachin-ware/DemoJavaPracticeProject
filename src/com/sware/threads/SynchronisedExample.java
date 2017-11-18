package com.sware.threads;

public class SynchronisedExample {

	public static void main(String[] args) {
		Demo d=new Demo();
		TestThread t1=new TestThread(d,"sachin");
		TestThread t2=new TestThread(d,"Sid");
		
		t1.start();
		d.sync2("Main");
		d.fun("Main");
		//t2.start();
	}

}

class TestThread extends Thread{
	Demo d;
	String name;
	
	public TestThread(Demo d,String name){
		this.d=d;this.name=name;
	}
	
	public void run(){
		this.d.sync1(this.name);
	}
}


class Demo{
	
	public synchronized void sync1(String caller){
		for(int i=15;i<20;i++){
			System.out.println("sync1 "+caller+" :"+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("exception in sync1:"+e.getMessage());
			}
		}
	}
	
	public synchronized void sync2(String caller){
		for(int i=50;i<55;i++){
			System.out.println("sync2 "+caller+" :"+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("exception in sync2:"+e.getMessage());
			}
		}
	}
	
	public void fun(String caller){
		for(int i=1;i<10;i++){
			System.out.println("fun "+caller+" :"+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("exception in fun:"+e.getMessage());
			}
		}
	}
}
