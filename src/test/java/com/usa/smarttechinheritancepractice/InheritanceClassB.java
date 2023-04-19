package com.usa.smarttechinheritancepractice;

public class InheritanceClassB extends InheritanceClassA{

	
  public void getHouse() {
		
		System.out.println("Mr.Adi junior owns 4 houses");	
			
	}
		
  protected void getRoom () {
	  
	 System.out.println("In each of the house Mr.Adi junior owns his own personal office and library");
	  			
		
	}

	public static void main(String[] args) {
		
		 InheritanceClassB obj = new  InheritanceClassB();
		 obj.getLand();
		 obj.getProperty();		
		 obj.getHouse();
		 
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	

