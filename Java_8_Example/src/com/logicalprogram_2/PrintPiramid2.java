package com.logicalprogram_2;
import java.util.Scanner;
class PrintPiramid2 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("which character do you want to enter");
		String p=sc.next();

		System.out.println("How many no do you want to enter");
		int no=sc.nextInt();

		for(int row=1;row<=no;row++){
			for(int colspace=1;colspace<=(no-row);colspace++){
				System.out.print(" ");
			}
			for(int colstar=1;colstar<=((row*2)-1);colstar++){
				System.out.print(p);
			}
			System.out.print("\n");
		}
	}
}
