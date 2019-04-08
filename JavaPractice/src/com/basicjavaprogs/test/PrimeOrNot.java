package com.basicjavaprogs.test;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void checkprime(int num) {
		
		int i;
		
		 for(i=2;i<num;i++) {	
			 if(num % i == 0) {
				 System.out.println("Number is not Prime");
				 break;
			 }
			 
		 }
		 if(num == i) {
			 
			 System.out.println("Number is Prime");
		 } 
		
		
	}

	public static void main(String[] args) {

        int n;
        
        System.out.println("Enter number to check prime or not");
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        checkprime(n);
        
        		

	}

}
