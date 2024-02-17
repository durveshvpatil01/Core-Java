package com.edubridge.generics;
import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		//1. Type-safety
		
		List<Integer>obj1=new ArrayList<>();
		obj1.add(11);
		
		//2. compile-time checking
		//obj1.add("11");
		System.out.println(obj1);
		
		//3. with generic,type-casting is not required
		List<String> obj2=new ArrayList<>();
		obj2.add("Durvesh");
		obj2.add("Gaurang");
		String str1=obj2.get(0);
		//without generic, type-casting is required
		//String str1=(String) obj2.get(0);
		
		System.out.println(str1);
		
		

	}

}
