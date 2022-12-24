package com.aruth.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class PostFixExp {
	public static void arithmeticfn(String str) {
		LinkedList<Integer> fifo = new LinkedList<>();
		for (int i = 0; i <= str.length() - 1; i++) {
			char let = str.charAt(i);
			if (Character.isDigit(let)) {
				fifo.add(let - '0');
			} else {
				int val1 = fifo.poll();
				int val2 = fifo.poll();
				switch (let) {
				case '+':
					fifo.addFirst(val1 + val2);
					break;
				case '-':
					fifo.addFirst(val1 - val2);
					break;
				case '/':
					fifo.addFirst(val1 / val2);
					break;
				case '*':
					fifo.addFirst(val1 * val2);
					break;
				}
			}
		}
		System.out.println(fifo.peek());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//input like 91732+*-*
		PostFixExp.arithmeticfn(input.next());
		input.close();
	}

}
