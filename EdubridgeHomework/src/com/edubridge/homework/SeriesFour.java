package com.edubridge.homework;

import java.util.Scanner;

public class SeriesFour {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float res=0.5f;
		float res1=1.5f;

		int n=s.nextInt();
		System.out.println(res);
		
		for(float i=1;i<n;i++) 
		{
			System.out.println(res1+" ");
			res1*=3;
			res+=res1;
		}
		s.close();

	}

}
