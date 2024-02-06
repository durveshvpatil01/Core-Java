package com.edubridge.finaldemo;
//child
final public class Passport extends Cards {
final int X=12;
	private final String passno="IND131231214";
	private String dateofexiry;
	public String getDateofexiry() {
		return dateofexiry;
	}
	public void setDateofexiry(String dateofexiry) {
		this.dateofexiry = dateofexiry;
	}
	public String getPassno() {
		return passno;
	}
	@Override
	public String toString() {
		return "Passport [passno=" + passno + ", dateofexiry=" + dateofexiry + ", toString()=" + super.toString() + "]";
	}
	
	final void accept(final int x) {
		System.out.println("final method"+x);
	}
	
	final void print() {
		System.out.println(X);
	}
}
