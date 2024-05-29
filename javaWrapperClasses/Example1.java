package com.javaWrapperClasses;

public class Example1 {

	public static void main(String[] args) {
		
		int age=28;
		
	//	Integer intObject = age;   // primitive type convert object type
		
		Integer intObject = Integer.valueOf(age);  // object type value
		
		System.out.println(intObject);  // method called valueOf
	}

}
