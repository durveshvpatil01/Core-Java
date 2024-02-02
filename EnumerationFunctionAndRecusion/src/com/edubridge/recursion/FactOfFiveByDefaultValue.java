package com.edubridge.recursion;

public class FactOfFiveByDefaultValue {

	public class FactorialOfFive {
		
		//int n=5;
		  static int factorial(int n) {
			  //int n=5;
			    if (n<=1) {
			      return 1;
			    }
			    return n * factorial(n - 1);//else
			  }
		  
	public static void main(String[] args) {
		
		System.out.println("Factorial of the number is: " + factorial(5));

	}

	}}
