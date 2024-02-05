package com.edubridge.thiskeyworddemo;
class Account{
	//instace var
	public String accType;
	public long accno;
	
	
	public void setData(String accType,long accno) {
		this.accType=accType;
		this.accno=accno;
	}
	
	public void display() {
		System.out.println(accType+accno);
	}
}

public class ThisKeyWordDemo {
	public static void main(String[] args) {
		
		Account obj=new Account();
		obj.setData("saving", 232);
		obj.display();
	}

	

}
