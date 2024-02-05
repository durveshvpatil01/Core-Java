package com.edubridge.thiskeyworddemo;

public class ThisKeyWordTwoDemo {
void printOne(ThisKeyWordTwoDemo d) {
	System.out.println("I am Durvesh");
}

void printTwo() {
	printOne(this);
}
	@SuppressWarnings({ "unused", "unused", "unused" })
	public static void main(String[] args) {
		ThisKeyWordTwoDemo d=new ThisKeyWordTwoDemo();
	}

}
