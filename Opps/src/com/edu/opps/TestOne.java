package com.edu.opps;
//parent class
class Dog{
	String color="black";
}
//sub class,childclass,derived
class Cat extends Dog{
	String color1="white";
	
}

public class TestOne {

	public static void main(String[] args) {
	
		//Dog d1=new Dog();		//since we have extends Dog 
		Cat c1=new Cat();
		System.out.println("Dog colour is:"+c1.color+" \nCat color is:"+c1.color1);

	}

}
