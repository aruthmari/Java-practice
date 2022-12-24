package com.aruth.practice;

import java.util.Scanner;

public class BinaryDigit {

	public String binaryConversion(int num) {
		StringBuilder form = new StringBuilder();
		while (num > 0) {
			int remainder = num % 2;
			num = num / 2;
			form.append(remainder);
		}
		while (form.length() <= 3) {
			form.append(0);
		}
		form.reverse();
		String result = form.toString();
		return result;
	}
	public static void anotherMethod(int decimal) {
		String anotherOutput = Integer.toBinaryString(decimal);
		System.out.println("Collection Method : "+anotherOutput);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number to convert in binary : ");
		int digit = input.nextInt();
		input.close();

		BinaryDigit object = new BinaryDigit();
		String output = object.binaryConversion(digit);
		System.out.println("Own Method : "+output);
		
		anotherMethod(digit);
	}
}
