package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng16
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int no=row;int k;
		for(int i=1;i<=row;i++)//for row
		{    
			for(int j=i;j<row;j++)//for space
	        {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)//for 1st part
	        {
				System.out.print(k);
			}

			k=k-2;
			for(; k>=1;k--)//for 2nd part
			{
				System.out.print(k);
			}
			System.out.println();//for new row
		}
	}
}