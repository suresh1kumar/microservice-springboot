package com.logicalprogram_3;
import java.util.Scanner;
class Triangle
{
   int b,h;
   Triangle()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Breath");
      b=sc.nextInt();
      System.out.println("Enter the Height");
      h=sc.nextInt();
   }
   void display()
   {
     double area=(b*h)/2;
     System.out.println("Area of Triangle "+area);
   }
   public static void main(String args[])
   {
      Triangle obj=new Triangle();
      obj.display();
   }
}