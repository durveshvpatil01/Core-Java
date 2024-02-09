package com.edubridge.baankaccount;

public class Driver {

	public static void main(String[] args) {
		saving obj=new saving();
		obj.bal=9000;
		obj.deposite(900);
		obj.withdraw(900, 105);
	}

}
