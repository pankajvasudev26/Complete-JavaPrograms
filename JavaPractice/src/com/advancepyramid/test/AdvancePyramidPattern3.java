/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

*/



package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern3 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			
			for(int k=num;k>i;k--) {
				
				System.out.print(" ");
				
			}
			
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(i+ " " );
			}
			
			System.out.println();
			
		}
	
	}

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter number to create pyramid");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		pyramid(n);
		

	}

}
