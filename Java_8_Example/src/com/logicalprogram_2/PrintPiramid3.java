package com.logicalprogram_2;
import java.util.Scanner;
class PrintPiramid3 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("How many no you want to enter");
		int totalRows=sc.nextInt();
		int row,colSpace,colStar;
		for(row=1;row<=totalRows;row++){
			for(colSpace=1;colSpace<=(totalRows-row);colSpace++){
				System.out.print(" ");
			}
			for(colStar=1;colStar<=((row*2)-1);colStar++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(row=totalRows-1;row>=1;row--){
			for(colSpace=1;colSpace<=totalRows-row;colSpace++){
				System.out.print(" ");
			}
			for(colStar=1;colStar<=(row*2)-1;colStar++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	
  }
}
