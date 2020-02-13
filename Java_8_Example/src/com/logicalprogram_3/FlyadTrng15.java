package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        char c=65;int no=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
	        {
				  System.out.print(c+" "+no+" ");
				  c++;no++;
			}
            System.out.println();//for new row
		}
	}
}