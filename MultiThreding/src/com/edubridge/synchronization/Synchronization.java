package com.edubridge.synchronization;

public class Synchronization {

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Thread t1=new Thread(new Runnable()
				{
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println();
					c1.increment();
					c2.increment();
				}//for
				}
			
				});
		t1.start();

	}

}
