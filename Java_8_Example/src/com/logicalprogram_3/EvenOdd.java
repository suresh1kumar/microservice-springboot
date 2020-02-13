package com.logicalprogram_3;
import java.util.Scanner;
class EvenOdd
{
   int no;
   EvenOdd()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
   }
   void display()
   {
     if(no%2==0)
      System.out.println("The given no is Even");
	 else
	  System.out.println("The given no is odd"); 	 
   }
   public static void main(String args[])
   {
      EvenOdd obj=new EvenOdd();
      obj.display();
   }
}