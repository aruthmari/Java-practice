package com.aruth.practice;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {

	public static void iterate() {
		Map<Integer,String> num = new HashMap<Integer,String>();
		num.put(1,"one");
		num.put(2,"two");
		num.put(3,"three");
		
		for(Map.Entry<Integer,String> elem : num.entrySet()) {
			System.out.println(elem);
		}
		num.forEach((k,v) -> System.out.println(k+" "+v)); 
	}
	public static void main(String[] args) {
		MapIterate.iterate();
	}
}
