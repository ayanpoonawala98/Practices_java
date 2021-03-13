package com.ayan.practice.Prerequisite_OOP;

public class Human {
	  
	String name;
	public int age; //instance variable
	int height;
	int weight;				//
	String eyeColor;
	int voice;
	int walk;
	
	public Human() {
		
	}
	
	public void speak() {
		System.out.println("Hello World, My name is  "+name);
		System.out.println("My age is  "+age + " years old");
		System.out.println("My height is  "+height);
		System.out.println("My weight is  "+weight);
		System.out.println("My eyes color is  "+eyeColor);
	}
	
	public void ear() {
		int normal = height +weight; //local variable
		System.out.println("earing .....");
		System.out.println(name +" can ear "+ voice + " hz");
	}
	public void eating() {
		System.out.println(name +" is vegan .....");
	}
	public void laughing() {
		System.out.println("HAHAHAHHAHAHA");
	}
	public void walking() {
		System.out.println("walking  ....."+ walk + " km per day");
	}

}
