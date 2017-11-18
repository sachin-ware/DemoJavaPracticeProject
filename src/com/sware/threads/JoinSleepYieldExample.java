package com.sware.threads;


class MyThread extends Thread
{
	public MyThread(String string) {
		this.setName(string);
	}

	public void run(){
		//Thread.yield();
		for(int i=0;i<5;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
	
	public void joinThread(MyThread t) throws InterruptedException
	{
		t.join();
	}
}
public class JoinSleepYieldExample {

	public static void main(String[] args)throws InterruptedException {
		 MyThread t1=new MyThread("t1");
		 MyThread t2=new  MyThread("t2");
		 t1.start();
		 t2.start();
		 
		 t1.join();
		 t2.join();
		 
		  
		 for(int i=0;i<5;i++){
			// System.out.println("Main Therad:"+i);
		 }
		 
		 
	}
}
