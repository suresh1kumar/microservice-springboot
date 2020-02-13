package com.logicalprogram_2;
/* input:nacre software services
output:secivres erawtfos ercan */

import java.util.Scanner;

class String1 
{
	public String takeInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String original=scan.nextLine();
		return original;
	}
	void PrintString( String original)
	{
		int len=original.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(original.charAt(i));
		}
	}
	public void startProgram()
	{
		String s=takeInput();
		PrintString(s);
	}

	public static void main(String[] args) 
	{
		String1 s1=new String1();
		s1.startProgram();
		
	}
}
