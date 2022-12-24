package com.aruth.practice;

public class TableExample {
	public static void main(String[] args) {
		int n = 5;
		while (n >= -5) {
			for (int i = 1; i <= 5; i++) {
				if (i <= n || i <= -n)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			n--;
			System.out.println();
		}
	}
}
