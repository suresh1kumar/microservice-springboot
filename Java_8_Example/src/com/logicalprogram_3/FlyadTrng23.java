package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng23
{
	public static void main(String[] args)
	{
		int i,j;char c=65;
        for(i=5;i>=1;i--)
        {
           for(j=1;j<=5;j++)
           {
             if(j<=i)
               System.out.print(c++);
             else
               System.out.print(" ");
           }
           for(j=5;j>=1;j--)
           {
              if(j<=i)
                System.out.print(--c);
              else
                System.out.print(" ");
           } 
            System.out.println();
        }
	}
}