/*
    1
   12
  123
 1234
12345
*/

package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern2 {
	
	public static void pyramid(int num) {
		
		for(int i=1; i<=num;i++) {
			
			for(int k=num;k>i;k--) {
				
				System.out.print(" ");
			}
	
			for(int j=1; j<=i;j++) {
				System.out.print(j);
			}
		
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		int n;
		
		System.out.println("Enter number to create pyramid pattern");
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		pyramid(n);
		
		

	}

}
