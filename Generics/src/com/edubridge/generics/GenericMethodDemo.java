package com.edubridge.generics;

public class GenericMethodDemo {
	
	public static <E> void accept(E arr1[])
	{
		for(E itr:arr1)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1= {11,56,45,89};
		String[]arr2= {"Shiv","Nia","Piyu"};
		GenericMethodDemo.accept(arr1);
		GenericMethodDemo.accept(arr2);


	}

}
