package com.usa.constructor;

public class ConstructorClassA {

	 ConstructorClassA(String name){
		 
	System.out.println(name);	 
	 }
	 
	 ConstructorClassA(int salary){
		 
		 System.out.println(salary);
	 }
	
	public static void main(String[] args) {
		ConstructorClassA obj = new ConstructorClassA (180000);
	}
	
	
}
