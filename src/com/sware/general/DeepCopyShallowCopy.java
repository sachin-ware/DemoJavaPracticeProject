package com.sware.general;

public class DeepCopyShallowCopy implements Cloneable{
	String member;
	
	
	public DeepCopyShallowCopy(String member) {
		this.member=member;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCopyShallowCopy o1=new DeepCopyShallowCopy("Member1");
		DeepCopyShallowCopy o2=new DeepCopyShallowCopy("Member2");
		o2=(DeepCopyShallowCopy) o1.clone();
		o2.member="skdjfsjd";
		System.out.println(o1.member);
		System.out.println(o2.member);
		
	}
	

}
