package com.usa.smarttechpolymorphismpractice;

public class MethodOverridingA {

	public void getArt () {
		
		System.out.println(" Art from MSA");
		
	}
	
	public void getSalary () {
		
		System.out.println("Saima's current salary is 12000");
		
		
	}
	
	public static void main(String[] args) {
	 MethodOverridingA obj = new  MethodOverridingA ();
	 obj.getArt();
	 obj.getSalary();
		 
	}
	
}
