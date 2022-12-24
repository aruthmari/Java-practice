package com.aruth.practice;

public class StringStudy {
	public static void main(String [] args) {
		String name = "marimuthu";
		
		char[] arr = new char[name.length()];
		name.getChars(2, name.length()-3, arr, 0); // To pick the characters in between the offset index
		System.out.println(arr); // ex : marimuthu - rimu ( 1st 2 char removed, last 3 char removed )
		
		// To count the distinct characters ex : marimuthu - 7
		System.out.println(name.chars().distinct().count());
		

	}
}
