package com.edubridge.thiskeyworddemo;

public class ThisKeyWordThreeDemo {
/*
 * This keyword is used to invoke current class constructor
 * 
 * */
public int x;
ThisKeyWordThreeDemo(){
	/*This keyword is calling to parameterize constructor*/
	    this(12);
	//super();
	System.out.println("Non -parameterized");
}

ThisKeyWordThreeDemo(int x){
	//x=10;
	//this();
	super();
	System.out.println("parameterized constructor");
}
	@SuppressWarnings({ "unused", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("unused")
		ThisKeyWordThreeDemo obj=new ThisKeyWordThreeDemo(10);
	}

}
