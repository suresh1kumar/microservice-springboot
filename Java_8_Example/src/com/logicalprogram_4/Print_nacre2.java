package com.logicalprogram_4;
import java.util.Scanner;
class  Print_nacre2
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
		char ch[]={'n','a','c','r','e'};
		int index=0;
		for(row=1;row<=no;row++)
		{
			for(sp=1;sp<=no-row;sp++)
			{
				System.out.print(" ");
			}
			index=0;
			for(col=0;col<row;col++)
			{
				System.out.print(ch[index]);
				index++;
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
		Print_nacre2 p1=new Print_nacre2();
		p1.startProgram();
	}
}