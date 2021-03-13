package com.ayan.practice.zoo;

public class Zoo {
	
	public static void main(String args[]) {
		
		Animal Lion =new Animal("Lion", 5,  25, false, "ROAR");
		Animal giraff =new Animal("giraff", 10,  100, false, "humhumhum");
		Animal impala =new Animal("impala", 7,  10, true, "trrrrrrr");
		
		Lion.speak();
		Lion.eating();
		impala.checkTypeMammel();
		impala.eating();
		Lion.checkTypeMammel();
	}

}
