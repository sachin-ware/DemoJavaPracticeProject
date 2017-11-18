package com.sware.programs;

public class ResvrseString {

	public static String revrseString(String str) {
		System.out.println("=="+str);
		if(str==null || str.length()<=1)
			return str;
		return revrseString(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		//String name="Sachin";
		System.out.println(revrseString("Sachin"));
		//System.out.println("="+name.substring(1));
		//System.out.println("hello");
	}
}
