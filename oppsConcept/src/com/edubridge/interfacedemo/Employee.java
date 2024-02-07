package com.edubridge.interfacedemo;
// program to demonstrate on cloneable built-in marker interface
public class Employee implements Cloneable{

	public int empid;
	public String empname;
	//if we are not implementing a clonable interface and if we are invoking the clonable driver class then we will get an exception as "classnotsupportedexception"
	public int salary;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public Employee(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	
	void display() {
		System.out.println("Emp id"+empid+"Emp name"+empname+"Salary"+salary);
	}

}
