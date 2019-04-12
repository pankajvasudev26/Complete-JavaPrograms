/*
11111
11122
11333
14444
55555
*/


package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern10 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			
			for(int k=num;k>i;k--) {
				System.out.print(1);
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number to create Pyramid pattern");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		pyramid(n);
		

	}

}
