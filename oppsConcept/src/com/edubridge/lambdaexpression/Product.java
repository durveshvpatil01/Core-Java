package com.edubridge.lambdaexpression;
@FunctionalInterface
public interface Product {

	void displayProductPrice(int price);
	//default method
	default String displayProductName()
	{
		return "Perfume";
	}
	
	static String ProductBrand()
	{
		return "Bella Vita";
	}
}
