/*
54321
 5432
  543
   54
    5
*/

package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern8 {
	
	public static void pyramid(int num) {
		
		for(int i=1; i<=num;i++) {
			
			for(int k=1;k<i;k++) {
				
				System.out.print(" ");
			}
	
			for(int j=num; j>=i;j--) {
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
