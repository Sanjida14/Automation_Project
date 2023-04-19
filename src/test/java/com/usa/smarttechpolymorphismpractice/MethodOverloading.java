package com.usa.smarttechpolymorphismpractice;

public class MethodOverloading {
	
	public void getName(int salary) {
			
		System.out.println(salary);
	}
	
	public void getName(double bonus) {
		System.out.println(bonus);	
		
	}
	
	public void getName(String name ) {
	
	System.out.println(name);
}


	public static void main(String[] args) {
		MethodOverloading obj = new  MethodOverloading ();
		obj.getName(1000);
		obj.getName(5000);
		obj.getName("Sanjida");
	}
	
	
	
	
	
	

}
