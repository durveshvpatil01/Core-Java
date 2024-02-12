package com.edubridge.list;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Object>s=new Stack<>();
		s.add(12);
		s.add("Durvesh");
		s.add(56);
		s.push(78);
		s.pop();
		System.out.println(s);
		
		
	}

}
