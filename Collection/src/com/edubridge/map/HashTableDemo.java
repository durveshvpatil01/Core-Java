package com.edubridge.map;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,String> obj=new Hashtable<>();
		/*HashMap keys are arrange in ascending order wise and hashtable keys are arrange in descending order wise*/
		obj.put(1,"dd");
		obj.put(2, "Gaurang");
		obj.put(3, "Patil");
		obj.put(1, "Rahul");
		//obj.remove(2);
		System.out.println(obj);
		/*we can't use key and values as null else we will get an null pointer exception*/
		//to extract values in plan text
		for(Map.Entry<Integer, String> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" ");
		}

	}

}
