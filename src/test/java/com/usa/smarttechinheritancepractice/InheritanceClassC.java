package com.usa.smarttechinheritancepractice;

public class InheritanceClassC extends InheritanceClassB {

	public void getArt () {

	System.out.println("Tafri owns Vincent Van Gogh's art pieces");		
		
	}
	
	
	public static void main(String[] args) {
		InheritanceClassC obj = new InheritanceClassC();
		obj.getProperty();
		obj.getLand();
		obj.getHouse();
		obj.getArt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
