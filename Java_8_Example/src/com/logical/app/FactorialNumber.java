package com.logical.app;

public class FactorialNumber {

	public static void main(String[] args) {
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial=1*2*3*4*5=120
		for (i = 1; i <= number; i++) {
		fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
