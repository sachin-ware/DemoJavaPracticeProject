package com.sware.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		
		map.put(1, "ONE");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(6, "SIx");
		
		Iterator<Integer> itr=(Iterator<Integer>) map.entrySet();
		while(itr.hasNext()){
			System.out.println(map);
		}
	}

}
