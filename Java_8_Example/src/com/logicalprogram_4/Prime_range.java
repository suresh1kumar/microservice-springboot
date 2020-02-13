package com.logicalprogram_4;
import java.util.Scanner;
public class  Prime_range
{
	public int takeNumber()
	{
		int number=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number :");
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
	
	public void printPrime(int number1,int number2)
	{
		boolean flag;
		System.out.println("Prime Number is :");
		for(int i=number1; i<number2; i++)
		{
			flag=true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(" "+i+" ");
		}
	}

	public void startProgram()
	{
		int number1=takeNumber();
		int number2=takeNumber();
		printPrime(number1,number2);
	}

	public static void main(String[] args) 
	{
		Prime_range primeObj=new Prime_range();
		primeObj.startProgram();		
	}
}
