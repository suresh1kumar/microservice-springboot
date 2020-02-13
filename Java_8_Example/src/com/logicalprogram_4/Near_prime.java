package com.logicalprogram_4;
import java.util.Scanner;
class  Near_prime
{
	public int takeInput()
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=Integer.parseInt(sc.next());
		return no;
	}
	public boolean isPrime(int no)
	{	boolean f=false;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{ 
				f=true;
				break;
			}
		}
		return f;
	}
	public void checkPrime(int no)
	{
		int near=0;
		if(isPrime(no)==true)
		{
			System.out.println("Enter no is not prime");
			near=nearestPrime(no);
			System.out.println("Nearest Prime no is: "+near);
		}
		else
			System.out.println("Enter no is prime");
	}
	public int nearestPrime(int no)
	{
		boolean flag=false;
		int forward=no;
		int backward=no;
		while(true)
		{
			if(isPrime(++forward)==flag)
				return forward;
			if(isPrime(--backward)==flag)
				return backward;
		}
	}

	public void startProgram()
	{
		int no=takeInput();
		checkPrime(no);
	}
	public static void main(String[] args) 
	{
		Near_prime p1=new Near_prime();
		p1.startProgram();
	}
}
