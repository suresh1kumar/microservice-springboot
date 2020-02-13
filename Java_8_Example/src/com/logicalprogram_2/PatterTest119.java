package com.logicalprogram_2;
/*  
     1  2  3  4  5 
	 16          6
     15          7
	 14          8
	 13 12 11 10 9

	 */
import java.util.Scanner;
class PatterTest119
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		int min=1;
		int max=4*no-4;
		for(int row=1;row<=no;row++){
			for(int col=1;col<=no;col++)
				{
				if(row==1 || col==no)
					{
					System.out.print(" "+min++);
				    }
				else  if(col==1 || row==no)
					{
					  System.out.print(""+max--);
				    }
				  else
					  {
					  System.out.print("  ");
				      }
			}
			System.out.println();
		}
	}

	public void startProgram(){
		int no=takeInput();
		printNumber(no);
	}
	public static void main(String[] args) 
	{
		PatterTest119 pt=new PatterTest119();
		pt.startProgram();
	}
}
