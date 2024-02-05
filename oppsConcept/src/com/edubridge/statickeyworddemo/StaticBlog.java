package com.edubridge.statickeyworddemo;

@SuppressWarnings("unused")
public class StaticBlog {
int x;
static String str;
static {
	/*
	 * Static block is usede  to initialize the static varibale only
	 * */
	str="static block";
	int y=12;
	
}
static void print() {
	System.out.println(str);
	
}
	public static void main(String[] args) {
	//	StaticBlog.print();
		StaticBlog.str="d";
		
	}

}
