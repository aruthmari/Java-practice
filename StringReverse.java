package com.aruth.practice;
import java.util.Scanner;

public class StringReverse {
	
	static String reverse(String sentence) {
		String[] words = sentence.split(" ");
		String revString = "";
		for (String word : words) {
			StringBuilder abc = new StringBuilder(word);
			revString = revString+ abc.reverse()+" ";
		}return revString;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the sentence : ");
		String sentence = sc.nextLine();
		sc.close();
		
		String revSentence = reverse(sentence);
		System.out.println(sentence);
		System.out.println(revSentence);
	}

}
