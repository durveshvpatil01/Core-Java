package com.edubridge.customexceptiondemo;

import java.util.Scanner;

public class Driver {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String email=s.next();
		String password=s.next();
		try {
			if(email.equals("d@gmail.com")&& password.equals("abc@123"))
				System.out.println("login successfully");
			else
				throw new LogicalCredentials("Invalid credentials");
		}
		catch(LogicalCredentials e) {
			System.out.println(e);
		}
		
		s.close();
	}

}
