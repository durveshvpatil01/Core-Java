package com.edubridge.inheritance.multilvelinheritance;

public class RollsRoyceWraith extends RollsRoyceGhost{

	public int speed;
	public int price;
	public RollsRoyceWraith(int speed, int price) {
		super(speed, price);
		this.speed=speed;
		this.price=price;
		super.price=70025840;
		super.speed=250;
	}
	@Override
	public String toString() {
		return "RollsRoyceWraith [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
