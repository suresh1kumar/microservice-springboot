package com.logical.app;

public class PrimeNumberAndNot {

	public static void main(String[] args) {

		int num = 110;
		boolean isprime = true;
		int temp = 0;

		for (int i = 2; i < num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println(num + " : prime number");
		} else {
			System.out.println(num + " : Not prime number");
		}
	}
}
