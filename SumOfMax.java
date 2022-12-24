package com.aruth.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfMax {
	static int maxOfArr(int[] arr,int len) {
		int i,sum = 0;
		if(len<5) {
			for(i=0;i<len;i++) 
				sum += arr[i];
		}
		else {
			Arrays.sort(arr);
			for(i=len-1;i>len-5;i--)
				sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array");
		String[] str =  s.nextLine().split(",");
		s.close();
		int len = str.length;
		int i = 0;
		int[] arr = new int[len];
		for(String digit : str) {
			arr[i] = Integer.valueOf(digit);
			i++;
		}
		System.out.println(maxOfArr(arr,len));
	}
}
