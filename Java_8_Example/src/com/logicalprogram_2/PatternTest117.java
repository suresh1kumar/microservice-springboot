package com.logicalprogram_2;
/*
		1
      1 3 1
	1 3 5 3 1
  1 3 5 7 5 3 1
1 3 5 7 9 7 5 3 1

*/
import java.util.Scanner;
class PatternTest117{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		int row,star,space=0;
		for(row=1;row<=no;row++){
			  int count=1;
			for(space=no-row;space>0;space--){
				System.out.print(" ");
			}
			for(star=1;star<=(2*row)-1;star++){
			    if(star<=row)
				{
					System.out.print(count);
					count=count+2;
				}

				else if(star>row && star==row+1)
				{
					count=count-4;
					System.out.print(count);
				}
				else
				{
					count=count-2;
					System.out.print(count);
				}
			}
			System.out.println();
		}
	}
	public void startProgram(){
		int no=takeInput();
		printNumber(no);
	}

	public static void main(String agrs[]){
        PatternTest117 pt=new PatternTest117();
		pt.startProgram();
	}
}

