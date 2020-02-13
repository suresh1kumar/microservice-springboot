package com.logicalprogram_2;
import java.util.*;

class  StringPalindrom
{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		original=scan.nextLine();

		int len=original.length();
		for(int i=len-1;i>=0;i--)
			reverse=reverse+original.charAt(i);

		if(original.equals(reverse))
			System.out.println("Entered string is a palindrom");
		else
			System.out.println("Entered string is not palindrom");
	}
	
}
