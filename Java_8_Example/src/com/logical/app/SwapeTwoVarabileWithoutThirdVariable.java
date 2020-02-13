package com.logical.app;

public class SwapeTwoVarabileWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 5, b = 9;
		a = a + b; // 5+9=14
		b = a - b; // 14-9=5
		a = a - b; // 14-5=9
		System.out.println(a + " " + b);

		// ---------
		int temp;
		int a1 = 5, b1 = 9;
		temp = a1;
		a1 = b1;
		b1 = temp;
		System.out.println(a1 + " " + b1);
	}
}
