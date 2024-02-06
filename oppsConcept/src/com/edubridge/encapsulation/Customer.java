package com.edubridge.encapsulation;

public class Customer extends HDFC{

	private String custname;
	private long custid;
	private int pinno;
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getCustid() {
		return custid;
	}
	public void setCustid(long custid) {
		this.custid = custid;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Customer [custname=" + custname + ", custid=" + custid + ", pinno=" + pinno + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
