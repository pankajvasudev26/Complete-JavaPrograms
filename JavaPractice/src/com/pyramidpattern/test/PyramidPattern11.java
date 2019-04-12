/*
A
AB
ABC
ABCD
ABCDE
*/
package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern11 {

	public static void pyramid(char num) {
		
		for(char i='A';i<=num;i++) {
			for(char j='A';j<=i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		char n;
		
		System.out.println("Enter number to create pyramid pattern");
		Scanner scan = new Scanner(System.in);
		
		n = scan.next().charAt(0);
		
		pyramid(n);

	}

}
