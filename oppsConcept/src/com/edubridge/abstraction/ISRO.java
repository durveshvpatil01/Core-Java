package com.edubridge.abstraction;

public class ISRO extends GovermentAgency{

	void displayDetails() {
		System.out.println("ISRO"+13000);
	}

	void displayDetails(String agencyName, long budget) {
		
		System.out.println("BRAC"+13000);
	}

	@Override
	public String toString() {
		return "ISRO [display()=" + display() + ", getAgencyName()=" + getAgencyName() + ", getBudget()=" + getBudget()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
