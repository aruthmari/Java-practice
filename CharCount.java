package com.aruth.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
	public static void mapping(String str) {
		char[] charSet = str.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char letter : charSet) {
			if (charMap.containsKey(letter)) {
				charMap.put(letter, charMap.get(letter) + 1);
			} else
				charMap.put(letter, 1);
		}
		System.out.println(charMap);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your NAME");
		CharCount.mapping(input.nextLine());
		input.close();
	}

}
