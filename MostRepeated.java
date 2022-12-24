package com.aruth.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostRepeated {

	public static void picking(int[] arr,int n) {
		Map<Integer, Integer> repeat = new HashMap<Integer, Integer>();

		for (int i = 0; i <= n - 1; i++) {
			if (repeat.containsKey(arr[i])) {
				repeat.put(arr[i], repeat.get(arr[i]) + 1);
			} else
				repeat.put(arr[i], 1);
		}
		int maxValue = Collections.max(repeat.values());
		for (Entry<Integer, Integer> numberEntry : repeat.entrySet()) {
			if (numberEntry.getValue() == maxValue) {
				System.out.println("Most Repeated number is = " + numberEntry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of array : ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers inside an array : ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		input.close();

		MostRepeated.picking(arr,n);
	}
}