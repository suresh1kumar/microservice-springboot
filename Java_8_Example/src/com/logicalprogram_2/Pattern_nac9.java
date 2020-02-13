package com.logicalprogram_2;
/*
		1
      1 3 1
	1 3 5 3 1
  1 3 5 7 5 3 1
1 3 5 7 9 7 5 3 1

*/
import java.util.Scanner;
class Pattern_nac9 
{
	public int takeInput()
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=Integer.parseInt(sc.next());
		return no;
	}
 public void pattern(int n)
	{
		int row,col,sp;
		int count;
		for(row=1;row<=n;row++)
		{
			System.out.println("");
			for(sp=1;sp<=n-row;sp++)
			{
				System.out.print(" ");
			}
			count=1;
			for(col=1;col<=(2*row)-1;col++)
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
				else
				{
					count=count-2;
					System.out.print(count);
				}
			}
		}
	}

	public void startProgram()
	{
		int no=takeInput();
		pattern(no);
	}
	public static void main(String[] args) 
	{
		Pattern_nac9 p1=new Pattern_nac9();
		p1.startProgram();
	}
}