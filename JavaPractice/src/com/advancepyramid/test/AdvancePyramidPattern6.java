    
/*  
    1
   121
  12321
 1234321
123454321
*/

package com.advancepyramid.test;

import java.util.Scanner;

public class AdvancePyramidPattern6 {
	
	public static void pyramid(int num) {
		
		for(int i=1;i<=num;i++) {
			
			for(int k=num;k>i;k--) {
				
				System.out.print(" ");
			}
								
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
			}
			
			for(int l=i-1;l>0;l--) {
				
				System.out.print(l);
			}
				
			
			System.out.println();
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter number to create pattern");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		pyramid(n);
		

	}
	

}
