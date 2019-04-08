package com.basicjavaprogs.test;

import java.util.Scanner;

public class fibonacciSeries {
	
	
	public static void fibonacci(int num){
		
		int a = 0, b = 1, c=0;
		
		System.out.print(a);
		System.out.print(b);
		
		while(num >= c) {
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.print(a);
			
		}
			
		
	}
	

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter the number upto which Fibonacci is Required");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		fibonacci(n);

	}

}
