package com.logicalprogram_4;
/* input:nacre software services
   output:services sowftare nacre*/
import java.util.Scanner;
class String3 
{
	public String takeInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		String original=scan.nextLine();
		return original;
	}
	void revString(String original)
	{
		
		String temp="";
		String rev="";
		for(int i=original.length()-1;i>=0;i--)
		{
			if(original.charAt(i) != ' ')
			{
				temp=original.charAt(i)+temp;
				
			}
			else
			{
				rev=rev+temp+" ";
				temp=" ";
			}
			
		}
		System.out.println(rev+temp);
	}

	public static void main(String[] args) 
	{
		String3 s1=new String3();
		//s1.startProgram();
		String original=s1.takeInput();
		s1.revString(original);
	}
}
