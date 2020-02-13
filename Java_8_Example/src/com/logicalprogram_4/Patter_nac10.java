package com.logicalprogram_4;
/*					
						1
					   234
					  56789
				     8765432
					123456789
				   87654321234

*/

import java.util.Scanner;
	
class Patter_nac10
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
			int count=0;
			boolean flag=true;
			for(int row=1;row<=no;row++)
			{
				System.out.println();
				for(int sp=1;sp<=no-row;sp++)
				{
					System.out.print(" ");
				}
				for(int col=1;col<=2*row-1;col++)
				{
					if(flag==true)
					{
						count++;
						System.out.print(count);
						if(count==9)
						{
							flag=false;
						}
					}
					if(flag==false)
					{
						count--;
						System.out.print(count);
						if(count==1)
						{
							flag=true;
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
	
		Patter_nac10 obj1= new Patter_nac10();
		obj1.startProgram();
		
	}		
}
