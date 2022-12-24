package com.aruth.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubSequence {
//	picks the longest subsequence of input at an increasing order
	public static void longest_sub(int arr_len,int[] arr) {
		int x = 0;
		Collection<Integer> name = null;
//	outer loop to iterate initial number of subsequence
		for(int i=0;i<=arr_len-1;i++) {
			Map<Integer, Integer> set = new HashMap<Integer, Integer>();
			int key = 1;
			set.put(key, arr[i]);
//	inner loop to iterate sequential order
			for(int j=i+1;j<=arr_len-1;j++) {
// 	to check for increasing order and put in map
				if(set.get(key)<arr[j]) {	
					set.put(++key, arr[j]);
				}else continue;
			}
//	longest comparison
			if(set.size()>x) {
				x = set.size();
//	collect the longest set
				name = set.values();
			}
		}
		System.out.println("Input Seqeunce is "+Arrays.toString(arr)+"\n"+"Longest increasing order Subsequence is "+name+"\n"+"Length of the LS is : "+x);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array set : ");
		String[] str_arr = input.next().split(",");
		int arr_length = str_arr.length;
		int[] arr_set = new int[arr_length];
		for(int i=0; i<arr_length; i++) {
			arr_set[i] = Integer.valueOf(str_arr[i]);
		}
		SubSequence.longest_sub(arr_length,arr_set);
		input.close();
	}

}
