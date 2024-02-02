package com.edubridge.recursion;

import java.util.Scanner;

public class FactorialOfFive {
	
	
	  static int factorial(int n) {
		   
		    if (n<=1) {
		      return 1;
		    }
		    return n * factorial(n - 1);//else
		  }

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println("Factorial of the number"+n+"is: " + factorial(n));

	}

}
