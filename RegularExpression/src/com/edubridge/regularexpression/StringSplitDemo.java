package com.edubridge.regularexpression;
import java.util.*;
public class StringSplitDemo {

	public static void main(String[] args) {
		String text="Money is power!";
		String[] res=text.split(" ");
		System.out.println(text.split(" "));
		for(String itr:res) {
			System.out.print(itr+" ");
		}
		
		String str1="there are 4 members in my family";
		String regex="\\d+";
		String res1=str1.replaceAll(regex,"four");
		System.out.println(res1);
		
	}

}
