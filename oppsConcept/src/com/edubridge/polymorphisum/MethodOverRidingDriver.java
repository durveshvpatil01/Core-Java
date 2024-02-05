package com.edubridge.polymorphisum;

public class MethodOverRidingDriver{

	public static void main(String[] args) {
		
		Googlemeet g=new Googlemeet();
		g.accept("Youtube","y@gmail.com");
		
		System.out.println(g instanceof Google);
	}

}
