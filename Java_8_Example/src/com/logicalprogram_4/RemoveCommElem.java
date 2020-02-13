package com.logicalprogram_4;
/* input:mirror
	output:miror*/

import java.util.Scanner;
class RemoveCommElem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int i;
		int len=s.length();
		for(i=0;i<len-1;i++)
		{
			if(s.charAt(i) !=s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.print(s.charAt(i));
	}
}
