package com.edubridge.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String>obj=new  HashSet<>();
		obj.add("Akshay");
		obj.add("Abhishek");
		obj.add("Aftab");
		obj.add("Atul");
		System.out.println(obj);
		
		Set<String>obj1=new  LinkedHashSet<>();
		obj1.add("Akshay");
		obj1.add("Abhishek");
		obj1.add("Aftab");
		obj1.add("Atul");
		System.out.println(obj1);		
		
		Set<String>obj2=new  TreeSet<>();
		obj2.add("Akshay");
		obj2.add("Abhishek");
		obj2.add("Aftab");
		obj.add("Atul");
		System.out.println(obj2);
	}

}
