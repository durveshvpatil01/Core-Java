package com.edubridge.multipleinheritance;
//child class
public class Boruto implements Naruto,Hinata{

	@Override
	public void powerOne(int noofchildren, String clan) {
		// TODO Auto-generated method stub
	
		System.out.println("No of childrens"+noofchildren+"Clan name"+clan);
	}

	@Override
	public void power(int noofchildren, String position) {
		System.out.println(""+noofchildren+position);
		
	}

}
