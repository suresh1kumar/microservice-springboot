package com.logicalprogram_2;
import java.util.Scanner;
class AshishTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no. do you want to print");
		int no=sc.nextInt();
	    System.out.println("\n");
		for(int i=1;i<=no;i++){
			int ctr1=1,ctr2=2;
			for(int j=1;j<=i;j++){
				if(i%2!=0){

				System.out.print(ctr1+" ");
				ctr1=ctr1+2;
				}
				else{
					System.out.print(ctr2+" ");
				ctr2=ctr2+2;
				}

			}
			System.out.println();
		}
	}
}
