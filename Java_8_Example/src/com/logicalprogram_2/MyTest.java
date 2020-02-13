package com.logicalprogram_2;
/*
pankaj kumar singh
hgnis ramuk jaknap
*/
import java.util.Scanner;
class MyTest{

	public String takeInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=scan.nextLine();
		return original;
	}
	void printString(String original){
		int len=original.length();
		for(int i=len-1;i>=0;i--){
			System.out.print(original.charAt(i));
		}
	}
	void startProgram(){
		String s=takeInput();
		printString(s);
	}

public static void main(String args[]){
	MyTest test=new MyTest();
	   test.startProgram();
   }
}