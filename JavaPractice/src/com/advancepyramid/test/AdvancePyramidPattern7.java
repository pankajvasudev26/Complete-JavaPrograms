/*
1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25 
*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern7 {
	
	public static void pyramid(int num) {
		
		
		for(int i=1;i<=num; i++) {
			
			int temp = i;
			for(int j=i;j>=1;j--) {
				
				 
				System.out.print(temp + " ");
				
				temp = temp + num;
								
				
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
