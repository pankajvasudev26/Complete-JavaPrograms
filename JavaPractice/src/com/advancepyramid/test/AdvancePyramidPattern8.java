/*
Pascal Triangle     
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 */


package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern8 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int k=num; k>=i;k--) {
				System.out.print(" ");
			}
			
			int temp = 1;
			for(int j=1;j<=i;j++) {
				System.out.print( temp + " ");
				
				temp = temp * (i-j)/(j);
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
