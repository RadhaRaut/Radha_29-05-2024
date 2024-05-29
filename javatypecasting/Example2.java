package com.javatypecasting;

public class Example2 {

	public static void main(String[] args) {
		
		int value1 = 200, value2= 300;
		
		float result = value1+ value2;   // implicit type casting -> internally
		
		System.out.println(result);
		
		System.out.println("------------------------------------------------");
		
		float value3 = 200.67f, value4= 300.78f;
		
		int result1 = (int)(value3+ value4);    //convert from float to integer -> explicit-> externally
		
		System.out.println(result1);            // wrapper class we also use.
		

	}

}
