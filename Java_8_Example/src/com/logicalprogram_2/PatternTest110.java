package com.logicalprogram_2;
/*
12345
1234
123
12
1
*/
import java.util.Scanner;
class  PatternTest110
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		for(int row=0;row<no;row++){
			int count=1;
			for(int col=no-row;col>0;col--){
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
		PatternTest110 pt=new PatternTest110();
		pt.startProgram();
	}
}
