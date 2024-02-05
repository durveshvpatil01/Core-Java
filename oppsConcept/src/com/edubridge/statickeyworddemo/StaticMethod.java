package com.edubridge.statickeyworddemo;
class LearnerDetails{
	static String name;
	static int rollno;
	/*
	 * 2-if anything is common then we can delare that vaibale as static for eg here institute name is commmon
	 * */
	
	static String institudeName="Edubridge";
	public static void print() {
		System.out.println(name+" "+rollno+" "+institudeName);
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		LearnerDetails.rollno=1;
		LearnerDetails.name="Durvesh";
		LearnerDetails.print();
		
		

	}

}
