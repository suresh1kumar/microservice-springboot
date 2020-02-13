package com.logicalprogram_4;
/* input:i love my india
output:I Love My India*/
import java.util.Scanner;
class CapitalFirstLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s1=sc.nextLine();
		int len=s1.length();
		String str="";
		char c1[]=s1.toCharArray();
	
		String temp="";
		for(int i=0;i<len;i++)
		{
			if(i==0)
			{
				
				if(c1[i]>=65 && c1[i]<=90)
				{ 
					str=str+c1[i];
				}
				else
				str=str+(char)(c1[i]-32);
			}
		   else if(c1[i]==' ')
			{
			   if(c1[i]>=65 && c1[i]<=90)
				{
				str=str+" "+c1[i+1];	
			   }
			   else
				str=str+" "+(char)(c1[i+1]-32);
			}
			else if(c1[i-1]==' ')
			{
				//str=" "+str;
			}
			else 
			{
				if(c1[i]>=65 && c1[i]<=90)
				{
					str=str+(char)(c1[i]+32);
				}
				else
					str=str+c1[i];
					

					
			}
		}
		
			System.out.print(str);
		
	}
}
