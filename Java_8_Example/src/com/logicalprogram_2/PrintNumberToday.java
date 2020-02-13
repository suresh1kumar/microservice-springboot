package com.logicalprogram_2;
import java.util.Scanner;
class  PrintNumberToday
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int row,col,count;
		for(row=0;row<no;row++){
			count=no-row;
			for(col=0;col<=row;col++){
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}
}
