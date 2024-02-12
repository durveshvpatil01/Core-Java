package com.edubridge.list;
import java.util.Queue;
import java.util.PriorityQueue;

public class Queuedemo {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<>();
		q1.add(15);
		q1.add(12);
		q1.add(3);
		q1.add(2);
		System.out.println(q1);
		for(int i:q1) {
			System.out.print(i+" ");
		}


	}

}
