package com.sware.threads;


class ThreadOne extends Thread
{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ThreadOne: "+i);
		}
	}
}

class ThreadTwo extends Thread
{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ThreadTwo: "+i);
		}
	}
}

public class Main 
{

	
	
	public static void main(String a[]) {

		Thread t1=new ThreadOne();
		t1.start();
		
		
		try {
			t1.join();
			
			
			for(int i=0;i<5;i++){
				System.out.println("Main:"+i);
			}
			
			t1.start();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			// TODO: handle finally clause
		}
	}
}
