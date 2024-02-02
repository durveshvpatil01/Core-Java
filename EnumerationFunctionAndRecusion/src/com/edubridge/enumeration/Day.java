package com.edubridge.enumeration;

public enum Day {

	SUNDAY(0.0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	
	private double i;
	
	Day(double index){
		this.i=index;
	}
	
	double displayIndex() {
		return i;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Day.TUESDAY);
		System.out.println(Day.SATURDAY.displayIndex());
	}
}
