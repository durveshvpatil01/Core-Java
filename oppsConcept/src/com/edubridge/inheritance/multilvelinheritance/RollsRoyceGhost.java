package com.edubridge.inheritance.multilvelinheritance;

public class RollsRoyceGhost extends RollsRoycePhantom {
	public int speed;
	public int price;
	
	public RollsRoyceGhost(int speed,int price) {
		super(speed,price);
		this.speed=speed;
		this.price=price;
		super.price=50025840;
		super.speed=240;
	}

	@Override
	public String toString() {
		return "RollsRoyceGhost [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
}
