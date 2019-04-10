/*
5
54
543
5432
54321
*/

package com.pyramidpattern.test;

import java.util.Scanner;

public class PyramidPattern5 {
	
	public static void pyramid(int num) {
		
		for(int i=num; i>0;i--) {
	
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
