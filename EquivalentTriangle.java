package com.aruth.practice;

public class EquivalentTriangle {
	static void eqiTri(int a) {
		int j = a;
		while (j > -a) {
			int k = (j>0)? j:-j;
			for (int i = 1; i <= a; i++) {				
				if (k > 0)
					System.out.print(" ");
				else
					System.out.print("* ");
				k--;
			}
			j--;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a = 4;
		eqiTri(a);
	}
}
