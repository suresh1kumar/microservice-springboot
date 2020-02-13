package com.logicalprogram_3;
import java.util.Scanner;
class PerfectNo
{
   int no;
   PerfectNo()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
   }
   void display()
   {
     int sum=0;
     for(int j=1;j<no;j++)
	 {
		 if(no%j==0)
		 {
			 sum=sum+j;
			// System.out.println(sum);
		 }
	 }
	 if(sum==no)
		    System.out.println(no+" no is Perfect");
     else
		    System.out.println(no+" no is not Perfect");
	 
   }
   public static void main(String args[])
   {
      PerfectNo obj=new PerfectNo();
      obj.display();
   }
}