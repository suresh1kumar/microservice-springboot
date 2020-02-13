package com.logicalprogram_4;
/*

    123454321
	1234  4321
	123     321 
	12         21
	1             1
*/


import java.util.Scanner;
class Pattern_nac8 
{
	public int takeInput()
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=Integer.parseInt(sc.next());
		return no;
	}
	public void pattern(int no)
	{
		int row,col,temp=0,sp,col1;
		if(no%2==0)
			no=no-1;
		int count=no-1;
		for(row=1;row<=no;row++)
		{
			for(col=1;col<=no-row+1;col++)
			{
				System.out.print(col);
			}
			for(sp=1;sp<2*(row-1);sp++)
			{
				System.out.print(" ");
			}
			for(col1=count;col1>=1;col1--)
			{
				System.out.print(col1);
			}
			count=no-row;
		System.out.println();
		}
	}
	public void startProgram()
	{
		int no=takeInput();
		pattern(no);
	}
	public static void main(String[] args) 
	{
		Pattern_nac8 p1=new Pattern_nac8();
		p1.startProgram();
	}
}
