package com.logicalprogram_2;
import java.util.Scanner;
class  PrintSivaPro
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void printString(String original){
		int len=original.length();
		String temp="";
		String rev="";
		for(int i=len-1;i>=0;i--){
			if(original.charAt(i)!=' '){
				temp=original.charAt(i)+temp;
			}
			else
			{
				rev=rev+temp+" ";
				temp="";
			}
		}
		System.out.println(rev+temp);
	}
public void startProgram(){
	String s=takeInput();
	printString(s);
}



	public static void main(String[] args) 
	{
		PrintSivaPro psp=new PrintSivaPro();
		psp.startProgram();
	}
}
