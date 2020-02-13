package com.logicalprogram_2;
import java.util.Scanner;
class PatternTest1
{
	public static void main(String args[]){
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many no do you want to enter");
		int no=sc.nextInt();
        System.out.println("--------------------------------------------");
		for(int i=1;i<=no;i++){
			for(int j=1;j<=i;j++){
		       count++;
				System.out.print(count);
				
			}
			System.out.print("\n");
		}
	}
};