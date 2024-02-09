package com.edubridge.uncheckedexception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeyWordDemo {
//code to demonstrate on throw and thorws keywords
	
	// throws keyword is used to declare a checked exception
	public static void donate(int age,int weight) throws IOException {
		if(age>18 && weight>45)
			System.out.println("Eligible to donate");
		else
			//throw is used to throw an exception explicitly
			throw new IOException("Not Eligible");
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter Values for Age And Weight Respectively");
		//int weight=s.nextInt();
		//int age=s.nextInt();
	try {
			ThrowKeyWordDemo.donate(s.nextInt(),s.nextInt());
		}
	catch(Exception e) {
			System.out.println(e);
		}
	}

}
