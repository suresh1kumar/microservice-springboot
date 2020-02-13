package com.logicalprogram_3;
import java.util.Scanner;
class RevNo
{
   int no;
   RevNo()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
   }
   void display()
   {
     int rem=0,rev=0;
	 while(no>0)//153
	 {
		 rem=no%10;//3,5,1
		 rev=rev*10+rem;//0+3=3*10+5=35*10+1=351
		 no=no/10;//15,1
	 }
	 System.out.println("reverce of number is "+rev);
   }
   public static void main(String args[])
   {
      RevNo obj=new RevNo();
      obj.display();
   }
}