package com.edubridge.staticsynchronization;

public class StaticSynchronization extends MyThread{

	public StaticSynchronization(welcome w) {
		super(w);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		welcome w1=new welcome();
		MyThread m1=new MyThread(w1);
		
		MyThread m2=new MyThread(w1);
		m2.setPriority(10);
		m1.setPriority(4);
		m1.start();
		m2.start();
	}

}
