package com.project;
import java.util.*;


public class CharCount 
{
	public void set1(String str)
	{
		char[] charSet = str.toCharArray();
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for (char letter : charSet)
		{
			if(charMap.containsKey(letter))
			{
				charMap.put(letter, charMap.get(letter)+1);
			}else
				charMap.put(letter, 1);
		}
		System.out.println(charMap);
	}
	
	public static void main(String []args)
	{
		CharCount input = new CharCount();
		input.set1("marimuthu");
	}
}
