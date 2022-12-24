package com.aruth.practice;

import java.util.*;
import java.util.stream.Collectors;

public class CharOccurStream {
    public static void main(String args[]) {
        String str = "Hello marimuthu";
        Map<String,Long> mp = Arrays.stream(str.split("")).map(String::toLowerCase).
        		collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));
        System.out.println(mp);
    }
}