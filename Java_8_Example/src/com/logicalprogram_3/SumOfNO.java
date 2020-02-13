package com.logicalprogram_3;
import java.util.Scanner;
class SumOfNO
{
   int no;
   SumOfNO()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
   }
   void display()
   {
     int rem=0,sum=0;
	 while(no>0)//153
	 {
		 rem=no%10;//3,5,1
		 sum=sum+rem;//3+5+1=9
		 no=no/10;//15,1
	 }
	 System.out.println("sum of number is "+sum);
   }
   public static void main(String args[])
   {
      SumOfNO obj=new SumOfNO();
      obj.display();
   }
}