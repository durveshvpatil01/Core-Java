package com.edubridge.blocksynchronize;

import com.edubridge.synchronization.SynchronizedMethod;

public class BlockB extends Thread{
	Flat m2;

	public BlockB(Flat m2) {
		super();
		this.m2 = m2;
	}
	public void run()
	{
		m2.print(15);
	}
}
