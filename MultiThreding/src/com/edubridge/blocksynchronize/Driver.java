package com.edubridge.blocksynchronize;

public class Driver {

	public static void main(String[] args) {
		Flat f=new Flat();
		BlockA a=new BlockA(f);
		BlockB b=new BlockB(f);
		a.start();
		b.start();
		
	}

}
