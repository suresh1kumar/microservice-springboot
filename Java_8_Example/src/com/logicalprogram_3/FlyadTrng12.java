package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng12
{
	public static void main(String[] args)
	{
	  /*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();*/
       
		for(int i=1;i<=5;i++)//for row
		{   
			 int p=5;
			for(int j=1; j<=i; j++)
			{
              System.out.print((p--)+" ");  
			}
            System.out.println();//for new row
		}
	}
}