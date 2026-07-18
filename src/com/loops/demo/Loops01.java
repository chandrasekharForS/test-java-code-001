package com.loops.demo;

import java.util.ArrayList;
import java.util.List;

public class Loops01 {

	public static void main(String[] args) {
		//1. while 
		
		/*int i = 1;
		
		while(i <= 5) {
			System.out.println(i);
			
			i++; // i = i + 1
		}*/
		
		
		//2. do while
		/*int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);
		*/
		
		// 3. for
		/*for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}*/
		
		//4. for-each
		
		/*String[] names = {"Rajesh", "Divya", "Anish"};
		for(String name:names) {
			System.out.println(name);
		}
		*/
		
		//5. forEach
		
		List<String> names = new ArrayList<String>();
		
		names.add("Rajesh");
		names.add("Divya");
		names.add("Anish");
		
		names.forEach(name -> System.out.println(name));
		
	}

}
