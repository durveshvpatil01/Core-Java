package com.edubridge.abstraction;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ISRO s=new ISRO();
		System.out.println(s.display());
		s.display();
		s.displayDetails();
		s.displayDetails("NASA",950000);
		
		Scanner d=new Scanner(System.in);
		
	}

}
