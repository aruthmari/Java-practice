package com.aruth.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStream {
	<T> List<T> removeDuplicate(ArrayList<T> group) {
		List<T> newGroup = group.stream().distinct().collect(Collectors.toList());
		return newGroup;
	}
	public static void main(String [] args) {
		ArrayList<Integer> group = new ArrayList<>(Arrays.asList(1,5,7,9,10,4,5,1,10,9,7,6));
		UsingStream obj = new UsingStream();
		System.out.println(obj.removeDuplicate(group));
	}
}
