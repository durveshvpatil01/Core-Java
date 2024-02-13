package com.edubridge.typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implecit or widing typecasting
		//smaller to larger
		char c='c';
		int num=c;
		System.out.println(num);
		
		//explicite or narrowing typecasting
		//larger to smaller data type size
		int num1=20;
		char x=(char) num1;
		System.out.println(x);
	}

}
