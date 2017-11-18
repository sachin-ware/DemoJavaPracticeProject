package com.sware.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.rmi.CORBA.StubDelegate;

import com.sware.general.Student;


public class SetDemo {

	public SetDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	/*	Set<Integer> hset=new HashSet<Integer>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		//hset.add(20);
		hset.add(40);
		System.out.println("Hash does not preserve insertion order:"+hset);

		Set<Integer> lhset=new LinkedHashSet<Integer>();
		lhset.add(10);
		lhset.add(20);
		lhset.add(30);
		lhset.add(40);
		lhset.add(50);
		lhset.add(20);
		lhset.add(40);
		System.out.println("LinkedHashSet presorves insertion order: "+lhset);
		
		Set hashset=new HashSet<>();
		
		hashset.add(1);
		hashset.add("1");
		hashset.add('c');
		hashset.add(10.25);
		
		Iterator itr =hashset.iterator();
		
		while(itr.hasNext()){
		//	itr.
		}*/
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("A", 5);
		map.put("B", 1);
		map.put("C", 3);
		map.put("D", 2);
		map.put("E", 0);
		
		map.put("F", 2);
		
		
		Map<String,Integer> sortedMap=new LinkedHashMap<String,Integer>();
		
		
		List<Integer> valuelist=new ArrayList<>(map.values());
		List<String> kaylist=new ArrayList<>(map.keySet());
		Collections.sort(valuelist);
		Collections.sort(valuelist);
		
		for(Integer value:valuelist){
			for(String key:kaylist ){
				if(map.get(key)==value){
					sortedMap.put(key, value);
				}
			}
		}
		
		System.out.println(map);
		System.out.println(sortedMap);
		
		/*Student s1=new Student("Sachin",813,77);
		Student s2=new Student("Sid",802,74);
		Student s3=new Student("Akash",101,65);
		Student s4=new Student("Ravi",302,77);
		Student s5=new Student("Sachin",813,77);
		Set hashset=new HashSet<>();
		hashset.add(10);
		hashset.add("10");
		System.out.println(hashset.add(s1));
		System.out.println(hashset.add(s2));
		System.out.println(hashset.add(s3));
		System.out.println(hashset.add(s4));
		System.out.println(hashset.add(s5));*/
		
		//System.out.println("Hetrogenious Objects are allowed in hashset"+hashset);
	}
}
