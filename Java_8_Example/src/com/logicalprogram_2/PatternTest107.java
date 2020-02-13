package com.logicalprogram_2;
/*
12345
 1234
  123
   12
    1
*/
import java.util.Scanner;
class  PatternTest107
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
			for(int colsp=1;colsp<row;colsp++){
				System.out.print(" ");
			}
			for(int colst=row;colst<=no;colst++){
				
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
		PatternTest107 pt=new PatternTest107();
		pt.startProgram();
	}
}
