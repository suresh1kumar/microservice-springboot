package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng19
{
	public static void main(String[] args)
	{

        int i,j;
        for(i=1;i<=9;i=i+2)
        {
          for(j=i;j<=9;j=j+2)
          {
             System.out.print(j);
          }
          System.out.println();//for new row
		}
	}
}