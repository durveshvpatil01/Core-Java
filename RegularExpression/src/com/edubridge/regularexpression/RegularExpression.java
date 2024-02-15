package com.edubridge.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String input= "TV price is 500 Rs";
		String regx=" ";
		
		
		
		Pattern p=Pattern.compile(regx);
		Matcher m=p.matcher(input);
		System.out.println(m.matches());
		

	}

}
