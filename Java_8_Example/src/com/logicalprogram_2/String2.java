package com.logicalprogram_2;
/* input:nacre software services
output:ercan erawtfos secivres */

import java.util.Scanner;
class String2 
{
	public String takeInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String original=scan.nextLine();
		return original;
	}
	/*void PrintString( String original)
	{
		int len=original.length();
		String temp="";
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			if(original.charAt(i) !=' ')
			{
				rev=original.charAt(i)+rev;
			}
			else
			{
				temp=temp+rev+" ";
				rev="";
			}
			temp=temp+rev;
		}	
		System.out.println(temp);
	}*/
/*	void PrintString(String original)
	{
	     String str1=" ";
		for(int j=original.length()-1;j>=0;j--)
		{
			char ch=original.charAt(j);
			original+=ch;
		}
		System.out.println("After reverse string is: " +str1);
	}
	void checkString(String original)
	{	int len=original.length();
		String ss="";
		original+=" ";
		for(int i=0;i<=len-1;i++)
		{
			char ch=original.charAt(i);
			if(ch!=' ')
			{ 
				ss=ss+ch;
			}
			else
			{
				PrintString(ss);
				ss=" ";
			}
		}
	}
*/
	void revString(String original)
	{
		
		String temp="";
		String rev="";
		for(int i=0;i<original.length();i++)
		{
			if(original.charAt(i) != ' ')
			{
				temp= original.charAt(i)+temp;
				//System.out.println(temp);
			}
			else
			{
				rev=rev+temp+" ";
				temp="";
				//System.out.println(rev);
			}
			
		}
		//rev=rev+" "+temp;
		System.out.println(rev+temp);
	}
	public void startProgram()
	{
		String original=takeInput();
		revString(original);
	}

	public static void main(String[] args) 
	{
		String2 s1=new String2();
		s1.startProgram();
		
	}
}
