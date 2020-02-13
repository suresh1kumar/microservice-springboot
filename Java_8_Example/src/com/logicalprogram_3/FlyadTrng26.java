package com.logicalprogram_3;
import java.util.Scanner;
class FlyadTrng26
{
	public static void main(String[] args)
	{
		int i, j;
        for(i=5;i>=1;i--)
        {
			char c=69;
           for(j=i;j<=5;j++)
           {
              //printf("%c",'A' + j-1);
			   System.out.print(c);
			   //c--;
			   c++;
           }
           System.out.println();
        }
	}
}
