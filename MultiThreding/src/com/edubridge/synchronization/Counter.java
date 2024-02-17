package com.edubridge.synchronization;

public class Counter extends Thread{
int count;
public synchronized void increment() {
	count ++;
	System.out.println("Count is:"+count);
}

}
