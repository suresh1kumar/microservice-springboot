package com.logicalprogram_3;
import java.util.Scanner;
class RangePerfectNo
{
   int rng;
   RangePerfectNo()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the range of number");
      rng=sc.nextInt();
   }
   void display()
   { 
     System.out.println("The Perfect no b/w 1 to "+rng+" is");
	   for(int i=1;i<rng;i++)
	   {
             int sum=0;
             for(int j=1;j<i;j++)
	         {
		         if(i%j==0)
		         {
			        sum=sum+j;	
		         }
	         }
	         if(sum==i)
		      System.out.println("Perfect no is "+sum);
	   }
   }
   public static void main(String args[])
   {
      RangePerfectNo obj=new RangePerfectNo();
      obj.display();
   }
}