package com.sware.threads;

public class InterruptExample {
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
		td.interrupt();
	}

}


class ThreadDemo extends Thread{

	public void run(){

		try{
			for(int i=0;i<=10000;i++){
				System.out.println("Child Thread:"+i);
				Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException ie){
			System.out.println("I am interrupted");
		}
	}
}