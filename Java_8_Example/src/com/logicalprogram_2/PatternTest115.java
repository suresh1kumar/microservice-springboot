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
class PatternTest115{
 
   public int takeInput(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("How many no do you want to print");
	   int no=sc.nextInt();
	   return no;
   }
   public void printStar(int no){
	    for(int k=1;k<=(2*no)-1;k++){
		   System.out.print("*");
	   }
	   System.out.println();
	  
	  for(int row=1;row<=no;row++){
	   for(int colst=no-row;colst>0;colst--){
			   System.out.print("*");
		   }
		   for(int colsp=1;colsp<=(2*row)-1;colsp++){
			   System.out.print(" ");
		   }
		   for(int colst=no-row;colst>0;colst--){
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   for(int row=no-1;row>0;row--){
		   for(int colst=no-row;colst>0;colst--){
			   System.out.print("*");
		   }
		   for(int colsp=1;colsp<=(2*row)-1;colsp++){
			   System.out.print(" ");
		   }
		   for(int colst=no-row;colst>0;colst--){
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   for(int n=1;n<=(2*no)-1;n++){
		   System.out.print("*");
	   }
   }

   public void startProgram(){
	   int no=takeInput();
	   printStar(no);
   }

	public static void main(String args[]){
		PatternTest115 pt=new PatternTest115();
		pt.startProgram();
	}
}

