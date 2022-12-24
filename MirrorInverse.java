package com.aruth.practice;
import java.util.Arrays;

public class MirrorInverse {
	static boolean isMirrorInverse(int[] arr) {
		
		for (int i = 0;i<=arr.length-1;i++) {
		if (arr[arr[i]] != i) {
			return false;
		}}
		return true;
	}
	public static void main(String [] args) {
		int [] arr = {3,4,2,0,1};
		
		if( isMirrorInverse(arr)) {
			System.out.println(Arrays.toString(arr)+" is real mirror inverse array");
		}else
			System.out.println(Arrays.toString(arr)+" is not mirror inverse array");
	}
}
