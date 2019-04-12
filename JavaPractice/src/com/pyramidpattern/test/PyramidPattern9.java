/*
1
10
101
1010
10101
*/

package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern9 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if((j % 2) == 0) {
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}							
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
