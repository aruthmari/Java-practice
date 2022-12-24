package com.aruth.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
	public static void main(String[] args) {
		LocalDateTime myTime = LocalDateTime.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String myDateTime = myTime.format(myFormat);
		System.out.println(myDateTime);
	}
}
