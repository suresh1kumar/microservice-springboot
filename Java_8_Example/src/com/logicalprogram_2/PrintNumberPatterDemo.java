package com.logicalprogram_2;
import java.util.Scanner;
class PrintNumberPatterDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int ctr=3;
		for(int row=1;row<=no;row++){
			for(int col=1;col<=row+1;col++){
				if(row==1 && col==2){
					System.out.println("1");
				}
				else if(row>=2 && col==row+1){
					System.out.println(ctr);
					ctr++;
				}
				else
				{
					System.out.print(row);
				}

	}
}
	}
}