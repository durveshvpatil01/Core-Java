package com.edubridge.staticsynchronization;

public class welcome {

	synchronized static void display(String str) {
		for(int i=1;i<=3;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
