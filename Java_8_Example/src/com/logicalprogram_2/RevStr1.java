package com.logicalprogram_2;
/*
pankaj kumar singh
hgnis ramku jaknap
*/
import java.util.Scanner;
class RevStr1{
   
	   public String takeInput(){
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a String");
		   String original=sc.nextLine();
		   return original;
	   }
	   public void printString(String original){
		   int len=original.length();
		   for(int i=len-1;i>=0;i--){
			   System.out.print(original.charAt(i));
		   }
	   }
	   public void startProgram(){
		   String s=takeInput();
		   printString(s);
	   }
	   public static void main(String args[]){
		   RevStr1 rs1=new RevStr1();
		   rs1.startProgram();
	   }
   }

