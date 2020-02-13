package com.logicalprogram_2;
import java.util.Scanner;
class StarTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to print");
		int no=sc.nextInt();
		for(int row=1;no>=row;row++){
			for(int sp=no-row;sp>0;sp--){
				System.out.print("-");
			}
			for(int st=1;(2*row)-1>=st;st++){
			System.out.print("*");
			}
			System.out.println();
		}


		for(int row=1;no-1>=row;row++){
			for(int sp=1;sp<=row;sp++){
				System.out.print("-");
			}
			for(int st=1;(2*row)-1>=st;st++){
			System.out.print("*");
			}
			
		}
	
	}
}
