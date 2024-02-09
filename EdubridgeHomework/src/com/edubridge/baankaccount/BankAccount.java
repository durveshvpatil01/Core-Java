package com.edubridge.baankaccount;

public class BankAccount {
	int bal;
	int am;
	int money;
	
	protected void deposite(int am) {
		this.am=am;
		System.out.println("amount to be deposit"+am);
	}

	
	void withdraw(int money,int bal) {
		this.bal=bal;
		this.money=money;
		if(bal>100) {
			System.out.println("withdraw money"+money);
		}
		else {
			System.out.println("bal is low");
		}
	}
	
	
	
	
}
