package com.edubridge.generics;
//program to demonstrate on Generic class
public class GenericClass<T,T1> {
	
	T num1;
	T1 str;
	
	void print(T num1, T1 str)
	{
		this.num1=num1;
		this.str=str;
		System.out.println("My name is: "+str+" "+" and my age is "+num1);
	}
	
	
	

	public static void main(String[] args) {
		GenericClass<Integer,String>obj1=new GenericClass<>();
		obj1.print(22, "Durvesh");

	}

}
