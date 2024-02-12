package com.edubridge.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Object>v=new Vector<>();
		v.add(12);
		v.add("Durvesh");
		v.add(5454545);
		v.add(true);
		System.out.println(v);
		
		for(Object itr:v) {
			System.out.print(itr+" ");
			
		}
		

	}

}
