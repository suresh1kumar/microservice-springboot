package com.logicalprogram_2;
/* print this star

      *
     **
    ***
   ****
  *****

*/
import java.util.*;
class PatternPrint2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no do you want to enter");
		int no=sc.nextInt();
		int sno=no-1;
		for(int row=1;row<=no;row++){
			for(int col1=1;col1<=sno;col1++){
				System.out.print(" ");
			}
			sno--;
			for(int col2=1;col2<=row;col2++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}