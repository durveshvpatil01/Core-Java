
package com.edubridge.classandobjectdemo;
/*
 * 
 * write a project to print the area and perimiter of two rectangles having side 4,5 and 5,8 respectively. 
 * by creating class nameed as rectangle with a method name area which returns the area
 * l and b which is passed to it's constructor.
 */
class rectangle{
	int l;
	int b;
//Paramiter constructor
	public rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public rectangle() {
		System.out.println("This is non paramiter const");
	}
	void area() {
		System.out.println("Area of rect"+l*b);
	}
	void perimiter() {
		System.out.println("Perimiter of reactangle is"+2*(l*b));
	}
}



public class ReactangleQuestion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		rectangle r=new rectangle(4,5);
		r.area();
		r.perimiter();

		
		rectangle r1=new rectangle(5,8);
		r1.area();
		r1.perimiter();

		
		rectangle w=new rectangle();
	}

}
