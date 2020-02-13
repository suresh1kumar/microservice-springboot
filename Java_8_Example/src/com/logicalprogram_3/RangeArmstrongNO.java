package com.logicalprogram_3;
import java.util.Scanner;
class RangeArmstrongNO
{
   int reng;
   RangeArmstrongNO()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the reng of number");
      reng=sc.nextInt();
   }
   void display()
   {
       int rem=0,sum,no=0;
	   for(int i=1;i<reng;i++)
	   {
		   no=i;sum=0;
	       while(no>0)
	       {
		     rem=no%10;
		     sum=sum+(rem*rem*rem);
		     no=no/10;
		   }
		   if(i==sum)
			   System.out.println("Armstrong no is "+i);
	   }
   }
   public static void main(String args[])
   {
      RangeArmstrongNO obj=new RangeArmstrongNO();
      obj.display();
   }
}