package com.logicalprogram_4;
/*
	1
	12
	123
	1234
	12345
	*/



import java.util.Scanner;
class Pattern_nac2 
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
		int row,col;
		for(row=1;row<=no;row++)
		{
			for(col=1;col<=row;col++)
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
		Pattern_nac2 p1=new Pattern_nac2();
		p1.startProgram();
	}
}
