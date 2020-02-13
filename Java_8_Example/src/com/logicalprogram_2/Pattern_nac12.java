package com.logicalprogram_2;
/*
	*       *        
    **     **
	***	  ***
	**** ****
	*********
	**** ****
	***   ***
	**     **
	*       *

*/

import java.util.Scanner;
class Pattern_nac12 
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
		for(int row=1;row<=2*no-1;row++)
		{
			System.out.println();
			for(int col=1;col<=2*no-1;col++)
			{
				if(row<=no)
				{
					if(col<=row)
					{
						System.out.print("*");
					}
					else if(col>row && col<2*no-row)
					{
						System.out.print(" ");
					}

					else
						System.out.print("*");
		
				}
			
				else{
					if(col<=2*no-row||col >=row)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
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
	
		Pattern_nac12 obj1= new Pattern_nac12();
		obj1.startProgram();
		
	}
}
