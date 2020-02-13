package com.logicalprogram_3;
import java.util.Scanner;
class Test2
{
	public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int[] no= new int[5];

        for (int i = 0; i <no.length; i++) 
		{
           System.out.print("Enter the number: ");
           no[i] =sc.nextInt();
		}
        // Printing the values
        for (int j = 0; j < no.length; j++) 
	    {
          System.out.println("ur number is :" + no[j]);
		}
    }
}
