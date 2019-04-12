/*
10000
02000
00300
00040
00005
*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern9 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=num;j++) {
				
				if(i==j) {
					System.out.print(j);
				}
				else {
					
					System.out.print("0");
				}
				
				
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
