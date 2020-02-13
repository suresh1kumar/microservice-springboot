package com.logicalprogram_2;
import java.util.Scanner;
class Plandrome 
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void printString(String original){
		String temp=original;
		String rev="";
		int len=temp.length();
		for(int i=len-1;i>=0;i--){
	     rev=rev + temp.charAt(i);
		}
		if(rev.equals(original))
			System.out.println("It is Plandrome");
			else
        System.out.println("It is not Plandrome");
	}
	public void startProgram(){
		String original=takeInput();
		printString(original);
	}



	public static void main(String[] args) 
	{
	    Plandrome p=new Plandrome();
		p.startProgram();
	}
}
