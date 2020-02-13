package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng25
{
	public static void main(String[] args)
	{
		int i,j;
        for(i=5;i>=1;i--)
        {
           for(j=5;j>=1;j--)
           {
             if(j<=i)
               System.out.print(j);
             else
               System.out.print(" ");
           } 
           System.out.println();
        }
	}
}