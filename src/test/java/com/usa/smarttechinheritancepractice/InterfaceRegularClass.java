package com.usa.smarttechinheritancepractice;

public class InterfaceRegularClass implements InterfaceA,  InterfaceB {

	public void getStudentcode() {
		
		System.out.println("The personal student code is S1420118");
		
	}

	public void getId() {
		
		System.out.println("student id include the person number of the student");
	}
	
	public static void main(String[] args) {
		InterfaceRegularClass obj = new InterfaceRegularClass ();
		obj.getStudentcode();
		obj.getId();
	}
		

}
