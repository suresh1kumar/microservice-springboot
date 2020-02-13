package com.logicalprogram_3;
/*
input-pankaj kumar singh
output-singh kumar pankaj
*/
import java.util.Scanner;
class  MyStringRev2
{ 
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void printString(String original)
	{
		String temp="";
		String rev="";
		int len=original.length();
	// for(int i=0;i<len;i++)//
		for(int i=len-1;i>=0;i--)
		{
			if(original.charAt(i)!=' ')
			{
				temp=original.charAt(i)+temp;
			}
			else
			{
			 rev=rev+temp+" ";
			 temp="";
			}
		}
		System.out.println(rev+temp);
	}
	public void startProgram()
	{
		String s=takeInput();
		printString(s);
	}
	public static void main(String[] args) 
	{
      MyStringRev2 msr2=new MyStringRev2();
	  msr2.startProgram();

	}
}
