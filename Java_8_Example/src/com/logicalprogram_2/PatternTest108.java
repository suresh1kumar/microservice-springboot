package com.logicalprogram_2;
/*
	1
	12
	123
	1234
	12345
	*/

import java.util.Scanner;
class  PatternTest108
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to enter");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		for(int row=1;row<=no;row++){
			int count=1;
			for(int colst=1;colst<=row;colst++){
				System.out.print(count);
				count++;
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
		PatternTest108 pt=new PatternTest108();
		pt.startProgram();
	}
}
