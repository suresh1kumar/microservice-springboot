package com.logicalprogram_2;
/*
input-madam
output-
m------>2
a------>2
d------>1
*/
import java.util.*;
class  MyStringRev3
{
   public String takeInput(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a String");
	   String original=sc.nextLine();
	   return original;
   }
   public void printString(String original){
     int len=original.length();
	 for(int i=0;i<len;i++){
		 int count=0;
		 boolean flag=true;
		 for(int j=i;j<len;j++){
			 for(int k=0;k<i;k++){

			 if(original.charAt(k)==original.charAt(i)){
				 flag=false;
				 break;
			 }
		}
		if(original.charAt(j)==original.charAt(i)){
			count++;
		}
	}
	if(flag==true){
		System.out.println(original.charAt(i)+"----------"+count);
	}
}
   }
  public void startProgram(){
	  String s=takeInput();
	  printString(s);
  }

public static void main(String[]args) 
	{
		MyStringRev3 msr3=new MyStringRev3();
		msr3.startProgram();
	}
}
