package com.logicalprogram_2;
import java.util.Scanner;
class BinaryToDecimal
{ 
	public String takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String n=sc.nextLine();
		return n;
	}
	public void binToDec(String n)
	{
		int no=Integer.parseInt(n);
		int i=0,temp,p,dec=0;
		while(no != 0)
		{
			temp=no%10;
			p=power(2,i);
			System.out.print(p);
			dec=dec+temp*p;
			no=no/10;
			i++;
		}
		System.out.println("Binary to Decimal of the number is: "+dec);
	}
	public int power(int n,int x)
	{
		int pow=1;
		for(int i=1;i<=x;i++)
		{
			 pow=pow*n;
			
		}
		return pow;
	}	
public void startProgram()
	{
		String no=takeInput();
		binToDec(no);
	}

	public static void main(String[] args) 
	{
	
		BinaryToDecimal obj1= new BinaryToDecimal();
		obj1.startProgram();
		
	}
	
}
