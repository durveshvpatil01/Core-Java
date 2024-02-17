package com.edubridge.synchronization;

public class ThreadOne extends Thread{
//referance obj of synchronized method class to access 
	SynchronizedMethod m1;

	public ThreadOne(SynchronizedMethod m1) {
		super();
		this.m1 = m1;
	}
	public void run()
	{
		m1.print(15);
	}

}
