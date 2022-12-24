package com.aruth.practice;
import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(String word) {
		int forwardIndex = 0, backwardIndex = word.length()-1;
		
		while (forwardIndex <= backwardIndex) {
		if (word.charAt(forwardIndex)!= word.charAt(backwardIndex)) {
			return false;
		}else
			forwardIndex++;
			backwardIndex--;
		}return true;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Word to be checked is Palindrome or not : ");
		String word = sc.next();
		sc.close();
		
		if (isPalindrome(word)) {
			System.out.println("\""+word+"\" is Palindrome");
		}else 
			System.out.println("\""+word+"\" is not Palindrome");
	}
}
