package com.java8.string;

public class ReverseWordString {
	public static void main(String[] args) {
		
		String str="my name is suresh kumar";
		/*String a[]=str.split(" ");
		System.out.println("Print Original String :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nReverse order::");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}*/
		
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverse);
	}

}
