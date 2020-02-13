package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int k=5;
		for(int i=1;i<=row;i++)
		{                 //5
			for(int j=1;j<=k;j++)
	        {
				  System.out.print("* ");
			}
			k--;
            System.out.println();//for new row
		}
	}
}