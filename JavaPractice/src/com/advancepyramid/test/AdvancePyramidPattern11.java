/*
55555
45555
34555
23455
12345
*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern11 {
	
	
	public static void pyramid(int num) {
		
		for(int i=num;i>=1;i--) {
			
			
			
			for(int j=i;j<=num;j++) {
				System.out.print(j);
			}
			for(int k=i;k>1;k--) {
				
				System.out.print(5);
			}
			
			
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter number to print pyramid pattern");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		pyramid(n);

	}

}
