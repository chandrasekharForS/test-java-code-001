package com.loops.demo;

import java.util.Scanner;

public class Loops04 {

	public static void main(String[] args) {
		// s = 1^2 + 2^2 + 3^2 + 4^2 +......+ n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		
		System.out.println("Sum of the series: " + sum);

	}

}
