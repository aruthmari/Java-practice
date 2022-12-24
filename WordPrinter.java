package com.aruth.practice;

import java.util.Scanner;

public class WordPrinter {
	public static void printprocess(String str) {
		char c = ' ';
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				String num = Character.toString(str.charAt(i));
				++i;
				if (i<len && Character.isDigit(str.charAt(i))) {
					num = num + str.charAt(i);
					int count = Integer.parseInt(num);
					for (int j = 1; j <= count; j++) {
						System.out.print(c);
					}
				} else {
					--i;
					int count = Integer.parseInt(num);
					if (count != 0) {
						for (int k = 1; k <= count; k++) {
							System.out.print(c);
						}
					}
				}
			} else {
				c = str.charAt(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the parsed string");
		WordPrinter.printprocess(input.next());
		input.close();
		// sample input a4f12r1q0
	}

}
