package com.logicalprogram_4;

/*   1  2  3  4  5 
	 16          6
     15          7
	 14          8
	 13 12 11 10 9
*/
import java.util.Scanner;
	
class Pattern_nac11
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
			int min=1;
			int max=4*no-4;
			for(int row=1;row<=no;row++)
			{
				System.out.println();
				for(int col=1;col<=no;col++)
				{
					if(row==1 || col==no)
					{
						System.out.print(" "+min++);
					}
					else if(col==1 || row==no)
					{
						System.out.print(""+max--);
					}
					else 
						System.out.print("  ");
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
	
		Pattern_nac11 obj1= new Pattern_nac11();
		obj1.startProgram();
		
	}
	}