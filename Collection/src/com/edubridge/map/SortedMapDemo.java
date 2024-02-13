package com.edubridge.map;
import java.util.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<String,Float> obj = new TreeMap<>(); 
		obj.put("dd",45f);
		obj.put("Gaurang",86.54f);
		obj.put("Patil",56f);
		obj.put("Rahul",69f);
		//obj.remove(2);
		System.out.println(obj);
		/*we can't use key and values as null else we will get an null pointer exception*/
		//to extract values in plan text
		for(Map.Entry<String,Float> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" "
					+itr.getValue());
		}
	}

}
