package com.logicalprogram_2;
/*
input-pankaj kumar singh 
output- jaknap ramuk hgnis
*/
import java.util.Scanner;
class MyStringRev
{
	/*public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	}
	public void printString(String original){
		String temp="";
		String rev="";
		int len=original.length();
		for(int i=0;i<len;i++){
			if(original.charAt(i)!=' '){
				temp=original.charAt(i)+temp;
			}else
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
	}*/

	public static void main(String args[]){
	  
	  MyStringRev msr=new MyStringRev();
	 // msr.startProgram();
	  
	  String original="dfdfasthtrtwer";
	  String temp="";
		String rev="";
		int len=original.length();
		for(int i=0;i<len;i++){
			if(original.charAt(i)!=' '){
				temp=original.charAt(i)+temp;
			}else
			{
				rev=rev+temp+" ";
				temp="";
			}
		}
			System.out.println(rev+temp);

	}
};