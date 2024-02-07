package com.edubridge.lambdaexpression;

public class ProductDriver {

	public static void main(String[] args) {
		
		//lambda expression
		Product p=(price) -> {
			System.out.println("Price is "+price);
		};
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBrand());
		p.displayProductPrice(700);
		

	}

}
