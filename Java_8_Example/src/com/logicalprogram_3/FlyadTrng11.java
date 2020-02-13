package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
       // int k=2;
		for(int i=1;i<=row;i++)//for row
		{                 //5
			for(int j=1;j<=i;j++)
			{
              if((i+j)%2==0)
			    System.out.print("1"+" ");
              else
                System.out.print("0"+" ");
			}
		//	k++;
            System.out.println();//for new row
		}
	}
}