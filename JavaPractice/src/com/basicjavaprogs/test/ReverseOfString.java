package com.basicjavaprogs.test;

import java.util.Scanner;

public class ReverseOfString {
	
	
	static String a = "";

	public static void revofstring(String str) {
		
		
		for(int i=str.length()-1; i>=0;i--) {
			
			a = a + str.charAt(i);
			
		}
		
			System.out.println(a);
	
	}
	
	public static void main(String[] args) {
		
		String str2;
		
		System.out.println("Enter String");
		Scanner scan = new Scanner(System.in);
		
		str2 = scan.nextLine();
		
		revofstring(str2);
	}

}
