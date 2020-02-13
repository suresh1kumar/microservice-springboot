package com.logicalprogram_2;
import java.util.Scanner;
class Pattern_vowel 
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
		int row,sp,col,count=0;
		char ch[]={'a','e','i','o','u'};
		for(row=0;row<no;row++)
		{
			System.out.println();
			for(sp=0;sp<(no-row);sp++)
			{
				System.out.print(" ");
			}
			for(col=1;col<2*row;col++)
			{
				System.out.print(ch[count]);
				count++;
				if(count>4)
				{
					count=0;
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
		Pattern_vowel mpObject=new Pattern_vowel();
		mpObject.startProgram();		
	}
}