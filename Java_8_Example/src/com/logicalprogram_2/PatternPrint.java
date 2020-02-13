package com.logicalprogram_2;
import java.util.Scanner;
class  PatternPrint
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("How many no you want to enter");
		int no=sc.nextInt();
		for(int row=1;row<=no;row++){
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
