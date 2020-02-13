package com.logicalprogram_2;
/*
			1
           010
          10101
		 0101010
		101010101
*/



import java.util.Scanner;
class Pattern_nac101
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
		int row,col,count=1,sp;
		for(row=1;row<=no;row++)
		{
			for(sp=1;sp<=no-row;sp++)
			{
				System.out.print(" ");
			}
			for(col=1;col<=2*row-1;col++)
			{
				if(count%2==0)
				{
					System.out.print("0");
					count++;
				}
				else
				{
					System.out.print("1");
					count++;
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
	
		Pattern_nac101 obj1= new Pattern_nac101();
		obj1.startProgram();
		
	}
	
}
