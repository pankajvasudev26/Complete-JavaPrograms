package com.basicjavaprogs.test;

import java.util.Scanner;

public class Table {

	public static void table(int num) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(+num+ "x" + i + "=" +(num*i) );
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter number to find Table");
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		table(n);
		
	}

}
