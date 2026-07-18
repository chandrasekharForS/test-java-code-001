package com.loops.demo;

import java.util.Scanner;

public class Loops02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the range: ");
		int s = scan.nextInt();
		
		/*int i = 1;
		int sum=0;
		
		while(i <= s) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum: " + sum);
		*/
		int sum = 0;
		
		for(int i = 1; i <= s; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

}
