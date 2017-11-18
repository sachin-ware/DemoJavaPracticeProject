package com.sware.general;

import java.util.HashMap;
import java.util.Map;

// This is example of getting number of occurances of each of the number in an array 
public class MapUsage {
	
	public static void main(String[] args) {
		try {
			
			int arr[]={1,2,3,4,5,6,8,9,5,4,7,8,5,2,1,4,6,8,5,11,12,15,18,20,15,5,20,15,10,20};
			
			Map<Integer, Integer>map=new HashMap<Integer,Integer>();
			System.out.println(arr.length);
			for(int ele: arr){
			//	System.out.println(ele);
				if(map.get(ele)!=null){
					map.replace(ele, map.get(ele)+1);
				}
				else{
					map.put(ele, 1);
				}
			}
			
			System.out.println(map.size());
			System.out.println(map);
			//Map<int, int>map=new HashMap<int,int>();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
