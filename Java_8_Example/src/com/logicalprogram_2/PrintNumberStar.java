package com.logicalprogram_2;
import java.util.Scanner;
class PrintNumberStar 
{
	public final static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int col,row,count;
		for(row=1;row<=no;row++){
			count=2;
			for(col=1;col<=row;col++){
				if(col==1 || col==row || row==no){
					System.out.print("*");
				}
				else
				{
				
					System.out.print(count);
					count++;
					
				}
			}
			System.out.println();
		}
	}
}
