package com.logicalprogram_3;
import java.util.Scanner;
class PositiveNo
{
   int no;
   PositiveNo()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
   }
   void display()
   {
     if(no>=0)
      System.out.println("The given no is Positive");
	 else
	  System.out.println("The given no is negative"); 	 
   }
   public static void main(String args[])
   {
      PositiveNo obj=new PositiveNo();
      obj.display();
   }
}