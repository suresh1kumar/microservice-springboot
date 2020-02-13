package com.logicalprogram_2;
/*
5
54
543
5432
54321
*/
import java.util.Scanner;
class PatternTest112 
{
  public int takeInput(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("How many no do you want to enter");
	  int no=sc.nextInt();
	  return no;
  }
  public void printNumber(int no){
	  for(int row=1;row<=no;row++){
		  int count=5;
		  for(int col=1;col<=row;col++){
			  System.out.print(count);
			  count--;
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
      PatternTest112 pt=new PatternTest112();
	  pt.startProgram();
	}
}
