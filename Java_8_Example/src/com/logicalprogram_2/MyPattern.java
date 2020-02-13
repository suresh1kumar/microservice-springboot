package com.logicalprogram_2;
/*
			1
           010
          10101
		 0101010
		101010101
*/


import java.util.Scanner;
class PatternTest111
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		return no;
	}
	public void printPattern(int no){
		int count=1;
		for(int row=1;row<=no;row++){
			for(int sp=1;sp<=no-row;sp++){
				System.out.print(" ");
			}
			for( int col=1;col<=2*row-1;col++){
				if(count%2==0){
					System.out.print("0");
					count++;
				}
				else{
					System.out.print("1");
					count++;
				}
				
			}
			System.out.print("\n");
		}
	}
     public void startProgram(){
		 int no=takeInput();
		 printPattern(no);
	 }
	 public static void main(String args[]){
         PatternTest111 mp=new PatternTest111();
		   mp.startProgram();
	 }
   };