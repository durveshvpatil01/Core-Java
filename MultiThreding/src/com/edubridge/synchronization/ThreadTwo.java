package com.edubridge.synchronization;

public class ThreadTwo extends Thread{

	SynchronizedMethod m2;

	public ThreadTwo(SynchronizedMethod m2) {
		super();
		this.m2 = m2;
	}
	public void run()
	{
		m2.print(5);
	}
	
}
