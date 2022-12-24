package com.aruth.practice;

public class ArraySum {
	static void rowAndColumn() {
		
		int[][] arr = {{ 5,4,6},
					   { 4,1,7},
					   { 2,9,3}};
		int k=1;
		for (int i=0; i<=2; i++) {
			int rowSum = 0;
			int colSum = 0;
			for (int j=0; j<=2; j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
			} 
			System.out.println("Sum of row "+k+" ="+rowSum);
			System.out.println("Sum of Column "+k+++" ="+colSum);
			}
	}
	public static void main(String [] args) {
		ArraySum.rowAndColumn();
	}
}
