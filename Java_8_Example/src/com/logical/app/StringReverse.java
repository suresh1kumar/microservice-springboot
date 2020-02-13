package com.logical.app;

public class StringReverse {
	public static void main(String[] args) {
		//String original = "ram is good boy";
		String original="H-e-l-l-o- -W-o-r-l-d";
		String temp = "";
		String rev = "";
		int len = original.length();
		for (int i = 0; i < len; i++) {
			if (original.charAt(i) != ' ') {
				temp = original.charAt(i) + temp;
			} else {
				rev = rev + temp + " ";
				temp = "";
			}
		}
		System.out.println(rev + temp);
	}
}
