package com.logicalprogram_2;
/*
pankaj kumar singh
singh kumar pankaj
*/
import java.util.Scanner;
class RevStr3{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void  printString(String original){
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
	public static void main(String args[]){
		RevStr3 rs3=new RevStr3();
		rs3.startProgram();
	}
}
		