/*
123454321
2345432
34543
454
5
*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern12 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				
				System.out.print(j);
				
			}
	        for(int k=num-1;k>=i;k--) {
	        	System.out.print(k);	        	
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
