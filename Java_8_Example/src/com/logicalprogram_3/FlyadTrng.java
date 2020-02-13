package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();

        //int a=1;   
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<i;j++)
			{
				//System.out.print(a+" ");
				  System.out.print((j+1)+" ");
				//a++;
			}
            System.out.println();
		}
	}
}