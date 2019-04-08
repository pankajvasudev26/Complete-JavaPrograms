package com.basicjavaprogs.test;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int num) {
		
		int fact = 1;
		
		while(num > 0) {
			
			fact = fact * num;
			num = num - 1;
			
			
		}
		
		
		return fact;
	}
	public static void main(String[] args) {

		int n,f;
		
		System.out.println("Enter a number to find Factorial");
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		f = factorial(n);
		
		System.out.println("Factorial of a number is " +f);

	}

}
