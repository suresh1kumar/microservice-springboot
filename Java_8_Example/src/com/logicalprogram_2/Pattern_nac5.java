package com.logicalprogram_2;
import java.util.Scanner;
class  Pattern_nac5
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
		int row,col,sp;
		for(row=1;row<=no;row++)
		{
			for(sp=1;sp<row;sp++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=(no-row)+1;col++)
			{
				System.out.print(col);
			}
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
		Pattern_nac5 p1=new Pattern_nac5();
		p1.startProgram();
	}
}
