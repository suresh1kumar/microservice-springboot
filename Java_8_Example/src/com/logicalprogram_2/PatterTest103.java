package com.logicalprogram_2;
/*

*****
****
***
**
*

*/
import java.util.Scanner;
class PatterTest103{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no you want to enter");
		int no=sc.nextInt();
		return no;
	}
	public void printStar(int no){
		for(int row=0;row<no;row++){
			for(int colst=1;colst<=no-row;colst++){
				System.out.print("*");
			}
			for(int colsp=0;colsp<row;colsp++){
				System.out.print(" ");
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
		PatterTest103 pt=new PatterTest103();
		pt.startProgram();
	}
}
