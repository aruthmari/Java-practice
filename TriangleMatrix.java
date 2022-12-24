package com.aruth.practice;

public class TriangleMatrix {
//	method for upper triangle matrix matching
	public static void find_triangle_case1(int[][] arr, int len) {
		int res = 0;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i][j] != 0) {
// call lower triangle matrix method
					find_triangle_case2(arr, len);
					res = 0;
					i=len;
					break;
				}else 
					res = 1;
			}
		}
		switch (res) {
		case 1:
			System.out.println("The is upper triangular matrix");
			break;
		}
	}
//	method for lower triangle matrix matching
	public static void find_triangle_case2(int[][] arr, int len) {
		int res = 0;
		for (int i = 0; i < len - 1; i++) {
			for (int j = len - 1; j > i; j--) {
				if (arr[i][j] != 0) {
					res = 2;
					i=len;
					break;
				}else
					res = 1;
			}
		}
		switch (res) {
		case 1:
			System.out.println("This is lower triangular matrix");
			break;
		case 2:
			System.out.println("This is ordinary matrix doesn't match any special case");
			break;
		}
	}
//	method for null matrix matching
	public static void find_null_matrix(int[][] arr, int len) {
		int res = 0;
		for(int i=0;i<=len-1;i++) {
			for(int j=0;j<=len-1;j++) {
				if(arr[i][j]!=0) {
//	call upper triangle matrix method
					find_triangle_case1(arr,len);
					res = 0;
					i=len;
					break;
				}else 
					res = 1;
				}
			}
		switch (res) {
		case 1:
			System.out.println("The given matrix is null");
			break;
		}
	}
	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 0, 1 },
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 1, 0, 0, 0 } };
		int len = arr.length;
//	call for null matrix method
		TriangleMatrix.find_null_matrix(arr, len);		
	}
}
