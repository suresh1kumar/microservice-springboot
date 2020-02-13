package com.logicalprogram_2;
/*
* using two for loop
     *
    ***
   *****
  *******
   *****
    ***
	 *

*/
import java.util.Scanner;
class  PrintPiramid1
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no do you want to enter");
		int no=sc.nextInt();
		return no;
	}
	public void printStar(int no){
      int row,k=1,sp=no-1;
	  for(row=1;row<=(2*no)-1;row++){
		     for(int j=1;j<=sp+k;j++){
				 if(j<=sp)
					 System.out.print(" ");
				 
				 else
					 System.out.print("*");
				 if(j>=no){
					 sp++;
					 k=k-2;
				 }
				 else{
					 k=k+2;
					 sp--;
				 }

	  }
	 }
	}

		  
	
	public void startProgram(){
		int no=takeInput();
		printStar(no);
	}

  public static void main(String[] args) 
	{
       PrintPiramid1 pp1=new PrintPiramid1();
	   pp1.startProgram();
	}
}
