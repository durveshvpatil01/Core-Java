package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*we can't create the object for collection interface*/
		//Collection<Integer>obj=new Collection<>();
	
		
		List<String>obj=new ArrayList<>();
		obj.add("Durvesh");
		obj.add("Neeraj");
		obj.add("Gaurang");
		System.out.println(obj);
		
		//to collect diffrent types of data we use Object
		List<Object>obj1=new ArrayList<>();
		obj1.add("Abhishek");
		obj1.add("Mohit");
		obj1.add(56);
		obj1.add(85.67);
		System.out.println(obj1);
		
		List<String>obj2=new ArrayList<>();
		obj2.addAll(obj);
		System.out.println(obj2.get(0));
		System.out.println(obj2.remove(2));
		//System.out.println(obj2.addFirst("efe3f"));
	}

}
