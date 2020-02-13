package com.logicalprogram_4;
import java.util.Scanner;
public class  DecimalToBinary
{
	public int takeNumber()
	{
		int number=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		try
		{
			number=Integer.parseInt(scan.next());
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("You should enter integer value only");
		}
		return number;
	}


	public void convertToBinary(int number)
	{		
		System.out.println(" "+number);
		
		String s="";
		int bin;
		while(number>0)
		{	
			bin=number%2;	
			number=number/2;
			count++;
			
		}
		int a[]=new int[count];
		
	}
					
	public void startProgram()
	{
		int number=takeNumber();
		convertToBinary(number);
	}

	public static void main(String[] args) 
	{
		DecimalToBinary obj=new DecimalToBinary();
		obj.startProgram();		
	}
}
