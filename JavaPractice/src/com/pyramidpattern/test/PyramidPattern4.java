/*
 12345
 1234
  123
   12
    1
*/

package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern4 {
	
	public static void pyramid(int num) {
		
		for(int i=num; i>0;i--) {
			
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
