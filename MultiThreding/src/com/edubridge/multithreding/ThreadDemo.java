package com.edubridge.multithreding;
// 1stcreating a thread by extending a thread class
public class ThreadDemo extends Thread{

	
	public void run() {
		System.out.println("Thread is in the running state:"
				+" "+Thread.currentThread());
	}
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*When we call start() method , automatically it calls to the run() method*/
		
		
		for(int i=1;i<4;i++) {
			
			ThreadDemo t1=new ThreadDemo();
			ThreadDemo t2=new ThreadDemo();

			System.out.println(t1.getName()+" "+t2.getName());
			
			t1.start();
			t2.start();
			
		}			
	}

}
