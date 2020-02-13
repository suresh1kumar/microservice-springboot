package com.logicalprogram_4;
import java.util.Scanner;
class Seco_max_min 
{
public void getMaxMin(int input)
	{ 
		int max1,min1,max2,min2;
		System.out.println("Enter the array:");
		int a[]=new int[input],temp=0;
		for(int i=0;i<input;i++)
		{
			Scanner sc=new Scanner(System.in);
			a[i]=sc.nextInt();
		}
	
		max1=min1=a[0];
		for(int i=0;i<input;i++)
		{
			if(a[i]>max1)
			{
				max1=a[i];
			}
			if(a[i]<min1)
			{
				min1=a[i];
			}
		}
		max2=min1;
		min2=max1;
		for(int i=0;i<input;i++)
		{
			if(a[i]>max2 && a[i] != max1)
			{
				max2=a[i];
			}
			if(a[i]<min2 && a[i] !=min1)
			{
				min2=a[i];
			}
		}
		System.out.println("max1: "+max1);
		System.out.println("min1: "+min1);
		System.out.println("max2: "+max2);
		System.out.println("min2: "+min2);
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int n=sc.nextInt();
		
		Seco_max_min s1=new Seco_max_min();
		s1.getMaxMin(n);

		
	}
}
