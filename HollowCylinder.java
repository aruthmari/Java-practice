package com.aruth.practice;

public class HollowCylinder {
	static void cylinderMaking(int x) {
		int j = 1;
		while(j<x+2) {
			for(int k = 1;k<=x;k++) {
				if(k>2 && k<x-1 && j>2 && j<x)
					System.out.print("  ");
				else
				System.out.print("* ");
			}
			j++;
			System.out.println();
		}
	}
	public static void main(String [] args) {
		int x = 6;
		cylinderMaking(x);
	}
}
