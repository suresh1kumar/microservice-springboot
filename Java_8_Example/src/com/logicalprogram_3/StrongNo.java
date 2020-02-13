package com.logicalprogram_3;
import java.util.Scanner;
class StrongNo
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
        int rem=0,sum=0,fact,k;
		k=no;
		while(no>0)//145
		{
			rem=no%10;fact=1;
		    while(rem>0)//5,4,1
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;//0+120+24+1=145
			no=no/10;//145/10=14,14/10=1
		}
		if(k==sum)
			System.out.println("Number is Strong");
		else
			System.out.println("Number is not Strong");
		
	}
}