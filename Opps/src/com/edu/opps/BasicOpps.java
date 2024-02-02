package com.edu.opps;

public class BasicOpps {
	int empId=101;
	int empAge=21;
	String empName="Durvesh";
	
	void Test() {
		System.out.println("Trying Method");
	}
	public static void main(String[] args) {
		BasicOpps e1=new BasicOpps();
		System.out.println(e1.empAge+""+e1.empId+" "+e1.empName);

		e1.Test();
	}

}
