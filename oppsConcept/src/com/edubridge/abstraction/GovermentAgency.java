package com.edubridge.abstraction;

public abstract class GovermentAgency {

	private String agencyName;
	private long budget;
	
	
	abstract void displayDetails();
	abstract void displayDetails(String agencyName,long budget);
	String display() {
		return "Concrete method";
	}
	
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "GovermentAgency [agencyName=" + agencyName + ", budget=" + budget + ", toString()=" + super.toString()
				+ "]";
	}
	

}
