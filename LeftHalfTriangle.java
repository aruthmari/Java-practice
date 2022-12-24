package com.aruth.practice;

public class LeftHalfTriangle {
	public static void main (String arg[]) {
		int n = 5;
		for(int i =1;i<=n;i++) {
			int k = i;
			while(k<=n) {
			System.out.print(" ");
			k++;
			}
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
