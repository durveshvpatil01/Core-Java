package com.edubridge.inheritance.singleinheritance;

public class Learner extends Trainer{

	public String Learnername;
	public int rollno;
	
	public void display() {
		System.out.println("Learner name is "+Learnername+"\nRoll  no is "+rollno);
		
		super.display();
	}

}
