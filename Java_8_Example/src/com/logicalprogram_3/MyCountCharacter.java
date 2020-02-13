package com.logicalprogram_3;
import java.util.Scanner;
class MyCountCharacter{
	public String takeInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=scan.nextLine();
		return original;
	}
	public void characterCount(String s)
	{
		System.out.println("Character Count of the String");

		for(int i=0;i<s.length();i++)
		{
			int count=0;
			boolean flag=true;
			for(int j=i;j<s.length();j++)
			{
				for(int k=0;k<i;k++)
				{
					if(s.charAt(k)==s.charAt(i))
					{
					  flag=false;
					  break;
					}
			    }//for k 
			    if(s.charAt(i)==s.charAt(j))
				{
				   count++;
		        }
	        }//for j
		    if(flag==true)
		    {
			  System.out.println(s.charAt(i)+"--------------------"+count);
		    }
	     }//for i
    }// method
    public void startProgram(){
	  String s=takeInput();
	  characterCount(s);
    }
    public static void main(String args[]){
	  MyCountCharacter mcc=new MyCountCharacter();
	  mcc.startProgram();
    }
}
