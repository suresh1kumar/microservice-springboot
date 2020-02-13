package com.logicalprogram_2;
/*
      1
	 234
	56789
   8765432
  123456789
  
 */
 import java.util.Scanner;
class  PatternTest118
{
	public int takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		return no;
	}
	public void printNumber(int no){
		int count=0;
		boolean flag=true;
		for(int row=1;row<=no;row++){
					
			for(int colsp=no-row;colsp>0;colsp--){
				System.out.print(" ");
			}
			for(int colst=1;colst<=(2*row)-1;colst++){
			//System.out.print("*");
				if(flag==true){
					count++;
				 System.out.print(count);
				 if(count==9){
					 
					 flag=false;
					 break;
				 }
				}
				
				if(flag==false){
				
					count--;
					System.out.print(count);
					if(count==1){
						flag=true;
					}
				}
				

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
      PatternTest118 pt=new PatternTest118();
	  pt.startProgram();

	
	}
}
