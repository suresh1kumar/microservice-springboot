package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int no=5;
		for(int i=1;i<=row;i++)//for row
		{                 //5
			for(int j=1;j<=no;j++)//for space
	        {
				  System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//for print *
	        {
				//System.out.print("*");
				  System.out.print("* ");
			}
		    no--;
            System.out.println();//for new row
		}
	}
}