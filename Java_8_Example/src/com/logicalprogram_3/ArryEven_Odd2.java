package com.logicalprogram_3;
import java.util.Scanner;
class ArryEven_Odd2
{
    public static void main(String[] args) 
    {
        int a[]={10,2,5,7,9,12};
		int n=a.length;
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}