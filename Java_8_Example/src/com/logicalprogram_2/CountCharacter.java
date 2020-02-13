package com.logicalprogram_2;
/*
	Enter the String:
	madam
	
	character count
	m--------2
	a--------2
	d--------1
	
	*/
import java.util.Scanner;
class  CountCharacter
{
	public String takeString()
	{
		String myString=null;
		System.out.println("Enter a String :");
		Scanner scan=new Scanner(System.in);
		myString=scan.next();
		return myString;
	}

	public void characterCount(String s)
	{		
		System.out.println("Character Count :");
		for(int i=0; i<s.length(); i++)
		{
			int count=0; 
			boolean flag=true;
			for(int j=i; j<s.length(); j++)
			{
				for(int k=0; k<i; k++)
				{
					if(s.charAt(k)==s.charAt(i))
					{
						flag=false;
						break;
					}
				}
				
				
				
				if(s.charAt(i)==s.charAt(j))
				{
					++count;
				}
			}
			if(flag==true)
			System.out.println(s.charAt(i)+"-------------"+count);			
		}
	}

	
	

	public void startProgram()
	{
		String s=takeString();
		characterCount(s);
	}

	public static void main(String[] args)
	{
		CountCharacter mysObject=new CountCharacter();
		mysObject.startProgram();
	}
}
