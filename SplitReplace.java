package com.aruth.practice;

import java.util.Arrays;

public class SplitReplace {
	public static void main(String[] arg) {
		String hai = "[41,56,14,18,24]";
		String mod_hai = hai.replaceAll("[^0-9,]", "");
		System.out.println(mod_hai);
		String[] hai_arr = mod_hai.split(",");
		System.out.println(Arrays.toString(hai_arr));
		for (int j = 0; j < 5; j++) {
			System.out.print(Integer.valueOf(hai_arr[j]) + " ");
		}
	}
}
