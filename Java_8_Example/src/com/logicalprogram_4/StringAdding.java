package com.logicalprogram_4;

/* String={"10","abc","20","abcd","abc10",30}
output:10+20+30=60
*/
import java.util.Scanner;
class StringAdding
{

	public void check(String s)
	{
		for(int l=0;l<s.length();l++)
		{
		  System.out.println(s.toCharArray(l));
		}
	}

	public static void main(String[] args) 
	{	
		StringAdding a1=new StringAdding();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			 str[i]=sc.next();
			 //System.out.println(str[i]);
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(str[j]);
		}
		for(int k=0;k<n;k++)
		{
			a1.check(str[k]);
		}
		
			
	}
}
