package com.logicalprogram_3;
import java.util.Scanner;
class ArmstrongNO
{
   int no;
   ArmstrongNO()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 3 digit number");
      no=sc.nextInt();
   }
   void display()
   {
     int rem=0,sum=0;
	 int org=no;
	 while(no>0)
	 {
		 rem=no%10;
		 sum=sum+(rem*rem*rem);
		 no=no/10;
	 }
	 if(org==sum)
		 System.out.println("Number is Armstrong");
	 else
		 System.out.println("Number is not Armstrong");
   }
   public static void main(String args[])
   {
      ArmstrongNO obj=new ArmstrongNO();
      obj.display();
   }
}