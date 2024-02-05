package com.edubridge.polymorphisum;
class Renualt{
	String carname;
	int noofsets;
	String col;
	int price;
	int speed;
	
	Renualt(String carname,int noofsets)
	{
		this.carname=carname;
		this.noofsets=noofsets;
		System.out.println(carname+noofsets);
	}
	
	Renualt(String carname,int noofsets,int speed)	{
		this.carname=carname;
		this.noofsets=noofsets;
		this.speed=speed;
		System.out.println(carname+noofsets+speed);
	}
}
public class OverLoadingdemo {

	public static void main(String[] args) {
		Renualt r=new Renualt("REX",5);
		Renualt r1=new Renualt("duster",7,110);
	}

}
