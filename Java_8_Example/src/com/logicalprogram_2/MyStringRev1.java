package com.logicalprogram_2;
/*
input-pankaj kumar singh
output-singh kumar pankaj
*/
import java.util.Scanner;
class  MyStringRev1
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void printString(String original){
		String rev="";
		int len=original.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+original.charAt(i);
			}
			System.out.println(rev);
	}
	public void startProgram(){
		String s=takeInput();
		printString(s);
	}

	public static void main(String[] args) 
	{
		MyStringRev1 msr1=new MyStringRev1();
		msr1.startProgram();
	}
}
