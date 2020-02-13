package com.logicalprogram_2;
/*

    123454321
	1234 4321
	123   321 
	12     21
	1       1

    12345654321
	12345 54321
	1234   4321
	123     321 
	12       21
	1         1

*/
import java.util.Scanner;
class  PatternTest116
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		if(no%2==0)
	    no=no-1;
		  int ctr=0;
		   for(int i=1;i<=(2*no)-1;i++){
			   
			 
				   if(i<=no){
					   ++ctr;
					   System.out.print(ctr);
					  
				   }
				   else
				   {
					   --ctr;
					  
					   System.out.print(ctr);
					  
				   }

		   }
	

		   System.out.println();
		   int n=no-1;
		   for(int row=1;row<=n;row++){
			   int count=1;
			   for(int colst=n-row;colst>=0;colst--){
				   System.out.print(count);
				 count++;  
			   }
			   System.out.print(" ");
			   for(int colsp=1;colsp<(2*row)-1;colsp++){
				   System.out.print(" ");
			   }
			    for(int colst=n-row;colst>=0;colst--){
					count--;
				   System.out.print(count);
				 
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
		 PatternTest116 pt=new  PatternTest116();
		 pt.startProgram();

	}
}
