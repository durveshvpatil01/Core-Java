package com.edubridge.polymorphisum;
//child class
public class Googlemeet extends Google {

	public void accept(String appName,String emailId) {
		super.accept("Google Drive", "d@gmail.com");
	
		System.out.println(appName+emailId);
	}
}
