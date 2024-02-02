package com.edubridge.packone;

public class AccessSpecifierDemo {

	@SuppressWarnings("unused")
	private int atm_pinNo;
	public String emailId;
	float percentage;

	
	@SuppressWarnings("unused")
	private void displayPinNo() {
		System.out.println();
	}
	
	public void displyEmail() {
		System.out.println(emailId);
	}
	
	void displyPercentage() {
		System.out.println(percentage);
	}
}
