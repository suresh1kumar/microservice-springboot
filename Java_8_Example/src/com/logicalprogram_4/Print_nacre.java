package com.logicalprogram_4;
import java.util.Scanner;
class Print_nacre
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
		char ch[]={'n','a','c','r','e'};
		int index=0;
		for(row=1;row<=no;row++)
		{
			index=0;
			for(col=1;col<=row;col++)
			{
				if(index>4)
				{
					//index=0;
					System.out.print(ch[index]);
					index++;
				}
				else
				{
					System.out.print(ch[index]);
					index++;
				}
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
		Print_nacre p1=new Print_nacre();
		p1.startProgram();
	}
}
