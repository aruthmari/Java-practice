package com.project;

public class Vowel 
{
	public static void main(String[] args)
	{
		System.out.println(containVowel("Hello"));
		System.out.println(containVowel("TV"));
	}
	public static boolean containVowel(String input)
	{
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
