package com.aruth.practice;

public class MathFunction {
	static void mathLogics() {
	
		int[] arr = { 5,4,7,1,3};
		int max= arr[0],min= arr[0],sum = 0;
		
		for (int nums : arr) {
			max = Math.max(max, nums);
			min = Math.min(min, nums);	
			sum += nums;
		}
		System.out.println("Maximum number of the array is "+max);
		System.out.println("Minimum number of the array is "+min);
		System.out.println("sum of the array is "+sum);
	}	
	public static void main(String [] args) {
		MathFunction.mathLogics();
	}
}
