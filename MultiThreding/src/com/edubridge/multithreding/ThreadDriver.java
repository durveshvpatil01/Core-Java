package com.edubridge.multithreding;

public class ThreadDriver implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("Thread "+i+" "+Thread.currentThread());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDriver t1=new ThreadDriver();
		t1.run();
	
	}

}
