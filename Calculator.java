package com.aruth.practice;
import java.util.Scanner;

public class Calculator {

	public static double calculation(int x, int y, char operator) {

		double res = 0;
		switch (operator) {

		case '+':
			res = x + y;
			break;
		case '-':
			res = x - y;
			break;
		case '*':
			res = x * y;
			break;
		case '/':
			res = x / y;
			break;
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first no: ");
		int no1 = sc.nextInt();

		System.out.print("Enter second no: ");
		int no2 = sc.nextInt();

		System.out.print("Enter the operator: [+,-,*,/]: ");
		char operator = sc.next().charAt(0);

		sc.close();

		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			double res = calculation(no1, no2, operator);
			System.out.println(no1 + " " + operator + " " + no2 + " " + "= " + res);
		} else
			System.out.println("Given operator is invalid");
	}

}
