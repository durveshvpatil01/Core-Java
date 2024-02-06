package com.edubridge.finaldemo;

public class Driver {

	public static void main(String[] args) {
	
		Passport p=new Passport();
		p.setDateofexiry("2028");
		p.setCardName("Durvesh");
		System.out.println(p);
		System.out.println(p.getPassno());
		p.accept(5);
		p.accept(12);
		p.print();
	
		
	}

}
