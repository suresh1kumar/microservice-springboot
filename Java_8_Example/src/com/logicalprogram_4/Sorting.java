package com.logicalprogram_4;
import java.util.Scanner;
class Sorting
{
	
	
	public static void getSorting(int input)
	{ 
		System.out.println("Enter the array:");
		int a[]=new int[input],temp=0;
		for(int i=0;i<input;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<input;i++)
		{
			for(int j=i+1;j<input;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(" "+a[i]);
		}
		System.out.println();

		for( int i=0;i<input;i++)
		{
			if(a[i]>0)
			{
				System.out.print(" "+a[i]);
			}
		}
	
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int n=sc.nextInt();
		
		Sorting.getSorting(n);

		
	}
}
