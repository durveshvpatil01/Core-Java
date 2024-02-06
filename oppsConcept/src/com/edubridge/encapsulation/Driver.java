package com.edubridge.encapsulation;

public class Driver {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setBranch("Thane");
		c.setCustid(15);
		c.setCustname("Durvesh");
		c.setIFCCOde("HDFC12132");
		c.setPinno(454561);
		System.out.println(c);
		System.out.println(c.getBranch());
	}

}
