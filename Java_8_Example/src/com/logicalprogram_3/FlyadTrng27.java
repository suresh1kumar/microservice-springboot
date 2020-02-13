package com.logicalprogram_3;
/*

   PATTERN

      A
     ABA
    ABCBA
   ABCDBCA
  ABCDEDCBA
 -----------
-------------

*/


/********************* CODE *********************/

import java.util.*;
class FlyadTrng27
{
   public static void main(String args[])
   {
     /*Scanner scr=new Scanner(System.in);
     System.out.println("Enter the number of rows. ");
     int n=scr.nextInt();*/
     char c;
     for(int i=1;i<=5;++i)        // FOR LOOP FOR NUMBER OF ROWS
     {
       c='A';
       for(int j=i;j<5;j++)        // FOR LOOP FOR PRINTING SPACES
       {
         System.out.print(" ");
       }
       for(int k=1;k<=i;k++)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
       {
         System.out.print(c);
         ++c;
       }
       c-=2;
       for(int l=1;l<i;l++)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
       {
         System.out.print(c);
         --c;
       }
       System.out.println();    // INTRODUCING NEW LINE
     } 

   } // end of main method
} // end of main class

/* OUTPUT

C:\Users\Aditya\Desktop\aditya>javac pattern7.java
C:\Users\Aditya\Desktop\aditya>java pattern7

Enter the number of rows.
6

     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA


*/
