package com.ayan.practice.zoo;

public class Animal {
	
	
	String name;
	int age;
	boolean mammel;
	int size;
	String voiceType;
	
	public Animal(String name, int age, int size, boolean mammel, String voiceType) {
		super();
		this.name = name;
		this.age = age;
		this.mammel = mammel;
		this.size = size;
		this.voiceType = voiceType;
	}
	
	public void speak() {
		System.out.println("The "+name + " "+voiceType );
	}
	
	public void walk() {
		 System.out.println("Walkinggggg");
		 
	}
	
	public void eating() {
		System.out.println("Eating...");
		
	}
	
	public void checkTypeMammel() {
		
		if( mammel ) {
			System.out.println("The animal is mammel");
		}
		else {
			System.out.println("The animal is not mammel");
		}
		
	}
}
