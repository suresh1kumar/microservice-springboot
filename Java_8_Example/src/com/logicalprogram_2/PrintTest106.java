package com.logicalprogram_2;
/*
			1
           010
          10101
		 0101010
		101010101
*/
import java.util.Scanner;
class  PrintTest106
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to enter");
		int no=sc.nextInt();
		return no;
	}
	public void printOneZero(int no){
		int count=0;
		for(int row=1;row<=no;row++){
			for(int colsp=no-row;colsp>0;colsp--){
				System.out.print(" ");
			}
			for(int colOneZero=1;colOneZero<=(row*2)-1;colOneZero++){
	                  count++;
                   if(count%2!=0){

				System.out.print("1");
				   }
				   else{
					   System.out.print("0");
				   }
			}
			System.out.println();
		}
	}
	public void startProgram(){
	int no=takeInput();
	printOneZero(no);
}

              
	public static void main(String[] args) 
	{
		PrintTest106 pt=new PrintTest106();
		pt.startProgram();
	}
}
