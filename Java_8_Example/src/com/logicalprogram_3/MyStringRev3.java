package com.logicalprogram_3;
/*
input-madam
output-
m------>2
a------>2
d------>1
*/
import java.util.Scanner;
class MyStringRev3 
{ 
	int i,j,k,len;boolean flag;
	public String takeInput()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println(" Enter any string element ");
	   String str=sc.nextLine();
	   len=str.length();//store string length
	   return str;
	}
	public void printString(String str)
	{
		  char ch[]=str.toCharArray();//String convert into char
		  
		  for(i=0;i<len;i++)
		  {
             int count=0;
			  for(j=0;j<i;j++)
			  {
				if(ch[i]==ch[j])
				{
                	flag=true;
					break;
				}
			  }
			  if(flag==false)
			  {
			     for(k=i;k<len;k++)
			     {
			       if(ch[i]==ch[k])
				   {
						count++;
				   }
				  }
			      System.out.println(ch[i]+"  "+count);
			   }
			}//for
		}
	    public void startProgram()
	    {
	     	String s=takeInput();
		    printString(s);
	    }
	    public static void main(String[] args) 
	    {
		   MyStringRev3  mc=new MyStringRev3();
		   mc.startProgram();
	    }
}
