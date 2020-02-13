package com.logicalprogram_2;
import java.util.*;
class PrintPiramid 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to enter");
		int no=sc.nextInt();

		for(int row=1;row<=no;row++){
			for(int colspace=1;colspace<=(no-row);colspace++){
				System.out.print(" ");
			}
			for(int colstar=1;colstar<=row;colstar++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
