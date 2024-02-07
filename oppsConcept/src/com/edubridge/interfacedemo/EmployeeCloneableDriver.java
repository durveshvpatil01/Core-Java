package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableDriver {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the empid");
		int empid=s.nextInt();
		
		System.out.println("Enter the empname");
		String empname=s.next();
		
		System.out.println("Enter the salary");
		int salary=s.nextInt();
		//override a clone method inside an implementable class to use
		Employee e1=new Employee(empid,empname,salary);
		e1.display();
		Employee e2=(Employee)e1.clone();
		e2.display();
	}
	
}
