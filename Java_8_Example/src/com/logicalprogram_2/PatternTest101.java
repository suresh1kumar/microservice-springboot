package com.logicalprogram_2;
/*

*
**
***
****
*****

*/
import java.util.Scanner;
class PatternTest101{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no do you want to print");
		int no=sc.nextInt();
		return no;
	}
	public void printPattern(int no){
		for(int row=1;row<=no;row++){
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
		public void startProgram(){
			int no=takeInput();
			printPattern(no);
		}
	public static void main(String args[]){
         PatternTest101 pt=new PatternTest101();
		 pt.startProgram();

       }
	}