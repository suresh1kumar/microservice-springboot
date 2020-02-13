package com.logicalprogram_2;
/* input:nacre software services
output:services software nacre*/
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
				temp="";
			}
			
		}
		System.out.println(rev+temp);
	}
	public void startProgram()
	{
		String original=takeInput();
		revString(original);
	}

	public static void main(String[] args) 
	{
		String3 s1=new String3();
		s1.startProgram();
		
	}
}
