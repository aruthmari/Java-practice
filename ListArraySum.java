package com.aruth.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListArraySum {
	
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,8,4,7,2);
		Integer sumReduce = list.stream().reduce(0, Integer::sum);
		System.out.println(sumReduce);
		
		Integer sumCollect = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sumCollect);
	}
}
