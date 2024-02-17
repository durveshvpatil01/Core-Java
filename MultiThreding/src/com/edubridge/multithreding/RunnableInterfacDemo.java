package com.edubridge.multithreding;

public class RunnableInterfacDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
		System.out.println("Thread"+i+" in running state");
		Thread.currentThread();
	}
	}
	public static void main(String[] args){
		RunnableInterfacDemo r=new RunnableInterfacDemo();
		Thread t=new Thread(r);
		//Thread t1=new Thread();		
			/*we are not creating obj for user defined classs 
			 * we are creating obj for thread class
			 */		
		
		//t1.run();
		
		try {
			t.sleep(500);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		//t1.sleep(5000);
		//System.out.println(t1);
		
	}

}
