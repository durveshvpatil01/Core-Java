package com.edubridge.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {

	public static void main(String[] args) {
		List<Object>obj=new LinkedList<>();
		obj.add("Durvesh");
		obj.add("Neeraj");
		obj.add("Gaurang");
		System.out.println(obj);
		//addFirst and addLastmethod does not work in LinkedList
		//System.out.print(obj.addFirst("wddw"));
		obj.add(0,12);
		System.out.println(obj);
		System.out.println(obj.contains(12));
		System.out.println(obj.remove(3));
		System.out.println(obj.removeAll(obj));
		System.out.println(obj);
		
		obj.add(101);
		obj.add(67);
		obj.add(65.65);
		System.out.println(obj);
		//obj.clear();
		System.out.println(obj);
		obj.lastIndexOf(obj);
		System.out.println(obj);
		//for extracting list elements
		for(Object itr:obj) {
			System.out.print(itr+" ");
			
		}
		/*
		Iterator<Object>itr1=obj.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1+" ");
		}*/
		System.out.println("\nCollections");
		Collections.reverse(obj);
		
		
		for(Object itr1:obj) {
			System.out.println(itr1+" ");
		}
	}
}




















