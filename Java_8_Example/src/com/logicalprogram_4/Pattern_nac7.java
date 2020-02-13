package com.logicalprogram_4;
/*  1
	2 6
	3 7 10
	4 8 11 13
	5 9 12 14 15
*/



import java.util.Scanner;
class Pattern_nac7 
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
	{	int n=no;
		int row,col,temp=0;
		for(row=1;row<=n;row++)
		{
			int diff=n-1;
			for(col=1;col<=row;col++)
			{
				if(col==1)
				{
					temp=row;
				}
				else
				{
					temp=temp+diff--;
				}
				System.out.print("  "+temp);
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
		Pattern_nac7 p1=new Pattern_nac7();
		p1.startProgram();
	}
}
