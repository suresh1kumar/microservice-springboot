package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int k=2;
		for(int i=2;i<=row;i++)//for row
		{                 //5
			for(int j=i;j<=k;j++)
			{
                System.out.print(j+" ");
			}
			k=k+2;
            System.out.println();//for new row
		}
	}
}