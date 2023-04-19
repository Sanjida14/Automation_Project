package com.usa.smarttechencapsulation;

public class EncapsulationPractice {

   private int salary = 14000;
   
   private  String getJobtittle = "Humer Resource Assistant";

   public int getSalary() {
	return salary;
}

   public String getJobtittle() {
	return getJobtittle;
}
   
	public static void main(String[] args) {
		EncapsulationPractice obj = new EncapsulationPractice ();
		System.out.println(obj.getJobtittle());
		System.out.println(obj.getSalary());	
	}
	
	
}
