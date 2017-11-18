package com.sware.general;

public class FinallyExample {

	
	public int fun() {
		try {
			System.exit(2);
			return 1;
		} catch (Exception e) {
			// TODO:
		}
		finally {
			
			System.out.println("FUn finally executed");
		}
		System.out.println("FUn before return final executed");
		return 0;
		
		
	}
	public static void main(String[] args) {
		try{
			System.out.println(new FinallyExample().fun());
			System.out.println("after fun");
			//System.exit(0);
		}catch (Exception e) {
		}
		finally {
			System.out.println("Finally executed");
		}

	}

}
