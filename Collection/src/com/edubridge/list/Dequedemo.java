package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dequedemo {

	public static void main(String[] args) {
		Deque<Integer>q1=new LinkedList<>();
		q1.add(15);
		q1.add(12);
		q1.add(3);
		q1.add(2);
		System.out.println(q1);
		q1.addFirst(1);
		q1.removeLast();
		System.out.println(q1.peek());
		q1.push(245);
		System.out.println(q1);
		/*q1.pollLast();
		q1.pollLast();
		q1.pollLast();*/ //if we use pollLast and list is empty then system will not give us error
		//q1.removeLast(); //if we use removeLast and list is empty then system will give us error
	}

}
