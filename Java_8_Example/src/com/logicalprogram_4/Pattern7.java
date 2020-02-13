package com.logicalprogram_4;
import java.util.Scanner;
class Pattern7
{
	public static int takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=Integer.parseInt(sc.next());
		return no;
	}

	public static void patternPrint(int no)
	{
		int row, col, sp, count;
		for(row=1;row<=no;row++)
		{
			for(sp=1;sp<=no-row;sp++)
			{
				System.out.print(" ");
			}
			count=1;
			for(col=1;col<=2*row-1;col++)
			{
				if(col<=row)
				{
					System.out.print(count);
					count=count+2;
				}
				else if(col>row && col==row+1)
				{
					count=count-4;
					System.out.print(count);
				}
				if
				{
					count=count-2;
					System.out.print(count);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int no = takeInput();
		patternPrint(no);
	}
}
