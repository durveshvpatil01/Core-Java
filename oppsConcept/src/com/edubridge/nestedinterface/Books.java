package com.edubridge.nestedinterface;
//outer interface
public interface Books {

	
	void showBooks();
	//nested interface
	//inner interface
	
	interface storyBooks{
		void showStorybooks();
	}
}
