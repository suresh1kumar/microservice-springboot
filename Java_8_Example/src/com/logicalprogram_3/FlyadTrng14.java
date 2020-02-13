package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng14
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int no=row;
		for(int i=1;i<=row;i++)//for row
		{    
			for(int j=0;j<i;j++)//for space
	        {
				System.out.print(" ");
			}
			for(int k=no;k>0;k--)
	        {
				System.out.print("*");
			}
		    no=no-2;
            System.out.println();//for new row
		}
	}
}