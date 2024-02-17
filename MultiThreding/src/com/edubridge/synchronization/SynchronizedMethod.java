package com.edubridge.synchronization;

public class SynchronizedMethod {

	public void print(int num) {
		for(int i=1;i<=5;i++) 
		{
		{
			System.out.println(num*i);
			try 
			{
				Thread.sleep(500);
				
			}//try
			catch(InterruptedException e) {
				System.out.println(e);
			}//catch
		}
		}
	}
}
