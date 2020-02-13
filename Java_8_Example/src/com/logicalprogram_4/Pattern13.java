package com.logicalprogram_4;
/*  7531357
      75357
        757
          7   */
   
import java.util.Scanner;
class Pattern13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int ctr=2*no-1;
		for( int row=1; row<=no;row++)
		{
			int count=7, p=no-row;
			for(int sp=1;sp<row;sp++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=ctr;col++)
			{
				System.out.print(count);
				if(p>0)
				{
					count=count-2;
				}
				else
				{
					count=count+2;
				}
				p--;
			}
			ctr=ctr-2;
			System.out.println();
	}
}
}