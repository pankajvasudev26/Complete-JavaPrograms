package com.pyramidpattern.test;

import java.util.Scanner;
/*
1
23
456
78910
1112131415
*/

public class PyramidPattern10 {
	
	static int count = 1;
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(count);
				count++;
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
