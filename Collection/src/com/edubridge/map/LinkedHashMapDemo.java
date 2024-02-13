package com.edubridge.map;
import java.util.*;
public class LinkedHashMapDemo {
// linked hash map give us ordred 
	public static void main(String[] args) {
		Map<Integer,String> obj=new LinkedHashMap<>();
		obj.put(1,"dd");
		obj.put(2, "Gaurang");
		obj.put(3, "Patil");
		obj.put(1, "Rahul");
		//obj.remove(2);
		System.out.println(obj);
		
		//to extract values in plan text
		for(Map.Entry<Integer, String> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" ");
		}
	}

}
