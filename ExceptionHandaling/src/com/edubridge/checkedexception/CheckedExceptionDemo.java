package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
//program to demonstrate on checked exception
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		File f=new File("D:\\Core Java_Durvesh _Patil\\token.html");
		try {
			FileInputStream f1=new FileInputStream(f);
			System.out.println("File Found");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found"+e);
		}

	}

}
