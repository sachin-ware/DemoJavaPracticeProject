package com.sware.programs;

public class FindSecondLargestNumberInArray {

	public FindSecondLargestNumberInArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[]=new int[]{5,8,36,45,21,15,95,74};
		
		int largest,slargest,tmp;
		largest=a[1];
		slargest=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>largest){
				slargest=largest;
				largest=a[i];
			}
			else{
				if(slargest<a[i]){
					slargest=a[i];
				}
			}
		}
		
		System.out.println("largest:"+largest);
		System.out.println("slargest:"+slargest);
	}
}
