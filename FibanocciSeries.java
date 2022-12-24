package com.aruth.practice;
import java.util.Scanner;

public class FibanocciSeries {
	
	public static void displayFibanocci(int n) {
		int x=1,y=0,z=0,count=1;
		while(count<=n) {
			System.out.print(z+"  ");
			z = x+y;
			x = y;
			y = z;
			count++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many numbers of fibanocci series to be show : ");
		int num = sc.nextInt();
		sc.close();
		
		FibanocciSeries.displayFibanocci(num);
	}
}
