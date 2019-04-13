/*
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern13 {
	
	
	public static void pyramid(int num) {
		
		for(int i=num;i>=1;i--) {
			
			for(int k=1;k<i;k++) {
				
				System.out.print(" "); 
			
				
			}
			
			for(int j=i;j<=num;j++) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number to create pyramid pattern");
		Scanner scan = new Scanner(System.in);		
		
		n=scan.nextInt();
		
		pyramid(n);

	}

}
