package com.edubridge.uncheckedexception;

/*when we thrown as exception inside a finally block before printing the statement*/
import java.util.Scanner;

public class CatchBlock {

	public static void main(String[] args) {
		int arr[]= {12,5,75};
		Scanner s=new Scanner(System.in);
		int x=45;
		System.out.println("Enter the value of y: ");
		int y=s.nextInt();
		try {
			System.out.println(x/y);
			try {
				System.out.println(arr[3]);
			}
			catch(ArithmeticException |ArrayIndexOutOfBoundsException e1) {
				System.out.println(e1);
				if(e1 instanceof ArithmeticException) {
					System.out.println(e1);
				}else {
					System.out.println(e1);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		finally {
			System.out.println("it is always run");
		}
		
		
	}

}


