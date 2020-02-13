package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng18
{
	public static void main(String[] args)
	{

        int k=2;
		for(int i=2;i<=6;i++)//for row
		{                 //5
			for(int j=i;j<=k;j++)//for space
	        {
				  System.out.print(j+" ");
			}
			k=k+2;
            System.out.println();//for new row
		}
	}
}