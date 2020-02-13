package com.logicalprogram_3;
/*

   PATTERN

      1
     212
    32123
   4321234
  543212345
 -----------
-------------

*/
/********************* CODE *********************/

import java.util.*;
class FlyadTrng28
{
public static void main(String args[])
{
   Scanner scr=new Scanner(System.in);
   System.out.println("Enter the number of rows ");
   int n=scr.nextInt();

   for(int i=1;i<=n;++i)
   {
      for(int j=1;j<=n-i;++j)
      {
        System.out.print(" ");
      }
      for(int k=i;k>=1;k--)
      {
        System.out.print(k);
      }
      for(int l=2;l<=i;l++)
      {
        System.out.print(l);
      }
      System.out.println();
   }

 }// end of main method
}// end of main class