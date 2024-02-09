package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithumMaticException {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=15;
		System.out.println("Enter the value of y");
	
		try {
			int y=s.nextInt();
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println("Arithmatic Exception Occured"+e);
		}

		
	}

}
