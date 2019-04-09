package com.basicjavaprogs.test;

import java.util.Scanner;

public class SwapWithout3rdVariable {
	
	public static void swap(int x, int y) {
		
		x = x + y;
		y = x - y;
		x = x - y;
		
	    System.out.println("Value of A after swaping " +x);
	    System.out.println("Value of B after swaping " +y);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		System.out.println("Enter Value of A");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		System.out.println("Enter Value of B");
		Scanner scan1 = new Scanner(System.in);
		b = scan1.nextInt();
		
		swap(a,b);
		
		

	}

}
