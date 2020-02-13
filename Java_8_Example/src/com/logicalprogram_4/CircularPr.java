package com.logicalprogram_4;
import java.util.Scanner;
class CircularPr 
{
	public static boolean isPrime(int num)
	{
		boolean flage=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flage=false;
				break;
			}
		}
			if(flage==true)
				return flage;
			else
				return flage;
	
	}
	public static void isCircularPrime(int no)
	{
		int digits=0;
		boolean flage=true;
		int r;
		int p=1,temp=no;
		while(no>0)
		{
			p=p*10;
			no=no/10;
			digits++;

		}
		p=p/10;
		for(int i=1;i<digits;i++)
		{
			r=(temp % p *10)+temp/p;
			System.out.println(r);
		    flage=isPrime(r);
			System.out.println(flage);
			if(!flage)
			{
				break;
			}
			temp=r;

		}
		if(flage==true)
			System.out.println("IT IS CERCULAR PRIME NO");
		else
			System.out.println("IT IS NOT CERCULAR PRIME NO");
	}

	public static void main(String[] args) 
	{
		int number;
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		isCircularPrime(number);
	}
}
		