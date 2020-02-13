package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
        int no=5;
		for(int i=1;i<=row;i++)//for row
		{                 //5
			for(int k=no;k>0;--k)//for print *
	        {
				System.out.print(k+" ");
			}
		    no--;
            System.out.println();//for new row
		}
	}
}