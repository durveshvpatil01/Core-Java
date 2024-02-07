package com.edubridge.interfacedemo;

public class Vibe implements Cafe{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Show menu="+menu);
		
	}

	public void displayPrice() {
		// TODO Auto-generated method stub
		System.out.println("The Price for"+menu+"is="+price);
	}

	@Override
	public void display(String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPrice(int price) {
		// TODO Auto-generated method stub
		
	}

}
