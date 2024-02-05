package com.edubridge.polymorphisum;
/*program to demonstrate on methods overloading*/
class stocks{
	String sharename;
	long sharePrice;
	String sharetype;
	


//METHODS overloading


public static void displayStockDetails(String sharename,long sharePrice) {
	System.out.println(sharename+" "+sharePrice);
}

public static void displayStockDetails(String sharename,String sharetype) {
	System.out.println(sharename+" "+sharetype);
}

}
public class MethodOverLoading {

	public static void main(String[] args) {
		stocks.displayStockDetails("Google",25000);
		stocks.displayStockDetails("Amazon", "nifty-50");

	}

}
