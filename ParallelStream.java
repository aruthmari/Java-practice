package com.aruth.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static void main (String [] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i = 1; i<100;i++) myList.add(i);
		Stream<Integer> parallelStream = myList.parallelStream();
		Stream<Integer> highNums = parallelStream.filter(p -> p>90);
		highNums.forEach(p -> System.out.println(p));
	}
}
