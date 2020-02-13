package com.logicalprogram_4;
/* 5
   54
   543
   5432
   54321*/
   
import java.util.Scanner;
class  Pattern_nac6
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
		for(row=no;row>=1;row--)
		{
			for(col=no;col>=row;col--)
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
		Pattern_nac6 p1=new Pattern_nac6();
		p1.startProgram();
	}
}
