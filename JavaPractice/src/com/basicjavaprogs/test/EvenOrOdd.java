package com.basicjavaprogs.test;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void evenodd(int num) {
		
		
		if(num % 2 == 0) {
			
			System.out.println("Entered number is Even");
		}
		else {
			System.out.println("Entered number is odd");
		}
			
		
	}

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter number to check even or odd");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		evenodd(n);				
		
	}

}
