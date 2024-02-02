package com.edu.opps;
/*
 * Create a class named 'Shape' with a method to print "This is This is shape". 
 * Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print 
 * "This is rectangular shape" and "This is circular shape" respectively. 
 * Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
 * Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
public class Test7 {
class Shape{
	void print() {
		System.out.println("This is This is shape");
	}
}

class Rectangle extends Shape{
	void print() {
		System.out.println("This is This is shape");
	}
	
}
class Circle extends Shape{
	void print() {
		System.out.println("This is This is shape");
	}
	
}
class Square extends Rectangle{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
