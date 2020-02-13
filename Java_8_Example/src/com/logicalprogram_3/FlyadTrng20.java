package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng20
{
	public static void main(String[] args)
	{
		 int i,j;
         for(i=4;i>=1;i--)
         {
            for(j=1;j<=4;j++)
            {
               if(j<=i)
                 System.out.print(j);
               else
                 System.out.print(" ");
           }
           for(j=4;j>=1;j--)
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