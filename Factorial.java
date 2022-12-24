package com.aruth.practice;

import java.util.Scanner;

public class Factorial {
	static int factorial = 1;
	public static int factProcess(int number) {
		if (number<=1)
			return factorial;
		factorial *= number;
		return factProcess(number-1);
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to find factorial : ");
		int number = input.nextInt();
		input.close();
		System.out.println("Factorial of "+number+" is : "+factProcess(number));
	}
}
