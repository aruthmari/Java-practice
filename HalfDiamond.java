package com.aruth.practice;

public class HalfDiamond {
	static void displayHalfDie() {
		int j, i;
		for (i = 1; i < 5; i++) {
			int property = i % 2;
			for (j = 1; j <= i; j++) {
				if (property == 0)
					System.out.print(j + " ");
				else
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 0; i < 4; i++) {
			int property = i % 2;
			for (j = 3; j > i; j--) {
				if (property == 1)
					System.out.print(j + " ");
				else
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		HalfDiamond.displayHalfDie();
	}
}
