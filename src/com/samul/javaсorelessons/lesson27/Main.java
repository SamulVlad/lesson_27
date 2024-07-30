package com.samul.javaсorelessons.lesson27;

public class Main {

	public static void main(String[] args) {
		TestClass tc1 = new TestClass();
		TestClass tc2 = new TestClass();
		
		tc1.a = 1;
		tc1.b = 1;
		
		tc2.a = 1;
		tc2.b = 1;
		
		System.out.println("0. " + tc1.compareTo(tc2));
		// или	
		System.out.println("0'. "  + TestClass.comp.compare(tc1, tc2));

		tc1.a = 10;
		tc1.b = 10;
		
		tc2.a = 20;
		tc2.b = 20;
		
		System.out.println("1. "  + tc1.compareTo(tc2));
		// или	
		System.out.println("1'. "  + TestClass.comp.compare(tc1, tc2));

		tc1.a = 30;
		tc1.b = 30;
		
		tc2.a = 20;
		tc2.b = 20;

		System.out.println("2. "  + tc1.compareTo(tc2));
		// или	
		System.out.println("2'. "  + TestClass.comp.compare(tc1, tc2));
		
		tc1.a = 10;
		tc1.b = 30;
		
		tc2.a = 20;
		tc2.b = 20;

		System.out.println("3. "  + tc1.compareTo(tc2));
		// или	
		System.out.println("3'. "  + TestClass.comp.compare(tc1, tc2));
		
	}

}
