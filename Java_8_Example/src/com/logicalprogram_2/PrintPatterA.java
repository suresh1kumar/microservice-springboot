package com.logicalprogram_2;
/*
     1
	234
   56789
  8765432
 123456789
 
 */
import java.util.Scanner;
class  PrintPatterA
{
	public static void main(String[] args) 
	{
		int count=1;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		for(int row=1;row<=no;row++){
			System.out.println();
			for(int sp=1;sp<=no-row;sp++){
				System.out.print(" ");
			}
			for(int col=1;col<=(2*row)-1;col++){
				if(flag==true){
				System.out.print(count);
				count++;
				}
				if(count==2*no){
					count=count-2;
					flag=false;
					break;
			    }
				if(flag==false){
					System.out.print(count);
					count--;
				}
				if(count==0){
					count=count+2;
					flag=true;
				}

			}

		}
	}
}
