package com.basicjavaprogs.test;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	
	public static void swap(int x, int y) {
		
		int c;
		
		c = x;
		x = y;
		y = c;
		
		System.out.println("Value of A after Swapping " +x);
		System.out.println("Value of B after Swapping " +y);
		
	}

	public static void main(String[] args) {
	
	int a,b;
	
	System.out.println("Enter Value for A");
	Scanner scan = new Scanner(System.in);	
	a = scan.nextInt();
	
	System.out.println("Enter Value of B");
	Scanner scan1 = new Scanner(System.in);
	b= scan1.nextInt();
	
	swap(a,b);
	
	

	}

}
