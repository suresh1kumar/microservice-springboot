package com.logicalprogram_2;
import java.util.*;
class PatternPrint1{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no do you want to enter");
		int no=sc.nextInt();
		int colno=no;
		for(int row=1;row<=no;row++){
			for(int col=1;col<=colno;col++){
				System.out.print("*");
			}
			System.out.println("");
			colno--;
		}

	}
}
