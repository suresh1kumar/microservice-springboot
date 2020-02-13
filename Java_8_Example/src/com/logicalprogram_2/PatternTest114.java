package com.logicalprogram_2;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
import java.util.Scanner;
class PatternTest114{
 
   public int takeInput(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("How many no do you want to print");
	   int no=sc.nextInt();
	   return no;
   }
   public void printDiamond(int no){
	   for(int row=1;row<=no;row++){
		   for(int colsp=no-row;colsp>0;colsp--){
			   System.out.print(" ");
		   }
		   for(int colst=1;colst<=(2*row)-1;colst++){
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   for(int row=no-1;row>0;row--){
		   for(int colsp=no-row;colsp>0;colsp--){
			   System.out.print(" ");
		   }
		   for(int colst=1;colst<=(2*row)-1;colst++){
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }

   public void startProgram(){
	   int no=takeInput();
	   printDiamond(no);
   }

	public static void main(String args[]){
		PatternTest114 pt=new PatternTest114();
		pt.startProgram();
	}
}

