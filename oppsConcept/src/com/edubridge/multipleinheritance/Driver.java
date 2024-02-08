package com.edubridge.multipleinheritance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Boruto b=new Boruto();
		System.out.println("Enter an input: ");
		int noofchildren=s.nextInt();
		String position=s.next();
		String clan=s.next();
		b.power(noofchildren, position);
		b.powerOne(noofchildren, clan);
		
	}

}
