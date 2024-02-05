package com.edubridge.classandobjectdemo;
//code on class and obj
class Vegetables
{

	//variables 
	String VegetableName;
	int price;
	//methods
	void print() {
		System.out.println("Vegetable Name:"+VegetableName+" "+"Price is:"+price);
	}
}
public class ClassAndObjectDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vegetables v=new Vegetables();
		v.VegetableName="Potato";
		v.price=24;
		v.print();
		

	}

}

