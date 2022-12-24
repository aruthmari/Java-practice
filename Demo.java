package com.aruth.practice;

import java.util.Arrays;

public class Demo {
	String name;
	public static void main(String [] args) {
		Demo obj = new Demo();
		String yes = obj.name;
		System.out.println(yes);
		
		int[] num = {4,5,7,8,9,1};
		System.out.println(Arrays.toString(num));
	}
}
