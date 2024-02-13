package com.edubridge.map;

import java.util.*;

public class HashMapDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<Integer,String> obj=new HashMap<>();
		obj.put(12,"dd");
		obj.put(2, "Gaurang");
		obj.put(3, "Patil");
		obj.remove(2);
		System.out.println(obj);
		
		
		

	}

}
