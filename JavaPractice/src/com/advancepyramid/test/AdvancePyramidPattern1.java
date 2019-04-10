/*
1
12
123
1234
12345
1234
123
12
1

*/



package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern1 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
		for(int i=num-1;i>0-1;i--) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
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
