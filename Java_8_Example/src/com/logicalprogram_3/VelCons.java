package com.logicalprogram_3;
import java.util.Scanner;
class VelCons
{
    public static void main(String args[])
    {
      /* Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
	   String s=sc.nextLine();*/
	   String s="PraShant";
	   String str=s.toLowerCase();
	// System.out.println(str);
        
	    int vel=0; int cnst=0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch=str.charAt(i);
		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		   {
			   vel++;
		   }
		   else
		   {
			   cnst++;
		   }
	   }
	   System.out.println("no of vawel->" +vel);
	   System.out.println("no of consonent->" +cnst);
    }
}