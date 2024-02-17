package com.edubridge.blocksynchronize;

public class Flat {
	public  void print(int num) {
		synchronized(this) {
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num*i);
			try 
			{
				Thread.sleep(50);
				
			}//try
			catch(InterruptedException e) {
				System.out.println(e);
			}//catch
		
		}
		}
	}
}
