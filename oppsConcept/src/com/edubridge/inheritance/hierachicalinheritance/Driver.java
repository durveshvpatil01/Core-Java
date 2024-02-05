package com.edubridge.inheritance.hierachicalinheritance;
//driver class where we call 
public class Driver {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		SnowCone s=new SnowCone();
		
		t.deviceName="Readmi note 10 pro max";
		t.Version="Android 12";
		t.print();
		s.deviceName="Readmi";
		s.Version="13";
		s.print();
		

	}

}
