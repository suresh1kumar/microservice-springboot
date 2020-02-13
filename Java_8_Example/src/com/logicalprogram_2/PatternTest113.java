package com.logicalprogram_2;
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/
import java.util.Scanner;
class  PatternTest113
{
   public int takeInput(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a no");
	   int no=sc.nextInt();
	   return no;
   }
   public void printNumber(int no){
	   int temp=0;
     for(int row=1;row<=no;row++){
              int diff=no-1;
	 for(int col=1;col<=row;col++){
		  if(col==1)
			 {
			    temp=row;
			 }     
              else
			 {
				  temp=temp+diff;
				  diff--;
			 }
			System.out.print(" "+temp);
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
		PatternTest113 pt=new PatternTest113();
		pt.startProgram();
	}
}
