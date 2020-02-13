package com.logicalprogram_2;
/*
    *
   ***
  *****
 *******
********* 

*/
import java.util.Scanner;
class  PatternTest105
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to enter");
		int no=sc.nextInt();
		return no;
	}
	public void printStar(int no){
		for(int row=1;row<=no;row++){
			for(int colsp=no-row;colsp>0;colsp--){
				System.out.print(" ");
			}
			for(int colst=1;colst<=(row*2)-1;colst++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void startProgram(){
		int no=takeInput();
		printStar(no);
	}
	public static void main(String[] args) 
	{
		PatternTest105 pt=new PatternTest105();
		pt.startProgram();
	}
}
