package com.edubridge.abstractionhomework;

public abstract class Vehicle {
	private int engno;
	private String ename;
	
	abstract void Startengine();
	abstract void Stopengine();
	
	abstract void Startengine(int engno,String ename);
	abstract void Stopengine(int engno,String ename);
	public int getEngno() {
		return engno;
	}
	public void setEngno(int engno) {
		this.engno = engno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Vehicle [engno=" + engno + ", ename=" + ename + ", getEngno()=" + getEngno() + ", getEname()="
				+ getEname() + ", toString()=" + super.toString() + "]";
	}
	
	
}
