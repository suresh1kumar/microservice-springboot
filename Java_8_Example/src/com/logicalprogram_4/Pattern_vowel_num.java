package com.logicalprogram_4;
import java.util.Scanner;
class Pattern_vowel_num 
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
		int row,sp,col;
		int ch1[]={1,2,3,4,5,6,7,8,9};
		char ch2[]={'a','e','i','o','u'};
		int index1=0;
		int index2=0;
		for(row=1;row<=no;row++)
		{
			System.out.println();
			for(sp=0;sp<(no-row);sp++)
			{
				System.out.print(" ");
			}
			for(col=0;col<2*row-1;col++)
			{
				if(row % 2==0)
				{
					if(index2 > 4)
					{
						index2=0;
						System.out.print(ch2[index2]);
						index2++;
					}
					
					else 
					{
						
						System.out.print(ch2[index2]);
						index2++;
					}
						
				
				}
				
				else
				{
					if(index1>8)
					{
						index1=0;
						System.out.print(ch1[index1]);
						index1++;
					}
				
					
					else
					{
						
						System.out.print(ch1[index1]);
						index1++;
					}
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
		Pattern_vowel_num mpObject=new Pattern_vowel_num();
		mpObject.startProgram();		
	}
}