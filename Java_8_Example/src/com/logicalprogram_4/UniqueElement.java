package com.logicalprogram_4;

import java.util.Scanner;
class UniqueElement
{
	public int input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		return n;
	}
	public void unique(int n1,int n2)
	{	
		int i,j;
		Scanner sc=new Scanner(System.in);
		int a[]=new int [n1];
		int b[]=new int [n2];
		System.out.println("Enter the first array: ");
		for(i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second array: ");
		for(j=0;j<n2;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.println("Unique element are: ");
		boolean flag=true;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
					break;
				}
				else
					flag=true;
	
			}
			if(flag)
			System.out.print(" "+a[i]);
		}
		boolean flag1=true;
		for(j=0;j<n1;j++)
		{
			for(i=0;i<n2;i++)
			{
				if(b[j]==a[i])
				{
					flag1=false;
					break;
				}
				else
					flag1=true;
			}
			if(flag1)
			System.out.print(" "+b[j]);
		}
	}

	public void startProgram()
	{
		int n1=input();
		int n2=input();
		unique(n1,n2);
	}

	public static void main(String[] args) 
	{
	
		UniqueElement obj1= new UniqueElement();
		obj1.startProgram();
		
	}
	
}