package com.edubridge.nestedinterface;
// Driver Class
public class NestedInterfaceChild implements Books, Books.storyBooks{

	
	
	@Override
	public void showStorybooks() {
		System.out.println("Half-Girlfirend");
		
	}
	@Override
	public void showBooks() {
		System.out.println("The Secret");	
	}
	
	public static void main(String[] args) {
		NestedInterfaceChild n=new NestedInterfaceChild();
		n.showBooks();
		n.showStorybooks();

	}
}
