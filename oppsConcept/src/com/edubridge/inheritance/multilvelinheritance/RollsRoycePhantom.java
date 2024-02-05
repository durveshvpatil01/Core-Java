package com.edubridge.inheritance.multilvelinheritance;
//parent class 1
public class RollsRoycePhantom {

	public int speed;
	public int price;
	public RollsRoycePhantom(int speed, int price) {
		super();
		this.speed=speed;
		this.price=price;
		//super.price=0025840;
		//super.speed=240;
		
	}
	@Override
	public String toString() {
		return "RollsRoycePhantom [speed=" + speed + ", price=" + price + "]";
	}
	
	/*
	void display() {
		System.out.println();
	}
	*/
}
