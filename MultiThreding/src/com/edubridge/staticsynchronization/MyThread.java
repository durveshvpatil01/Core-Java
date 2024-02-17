package com.edubridge.staticsynchronization;

public class MyThread extends Thread{

	welcome w;
	public MyThread(welcome w) {
		super();
		this.w=w;
	}
	
	public void run() {
		welcome.display(getName());
	}

}
