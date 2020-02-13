package com.logicalprogram_2;
/*
pankaj kumar singh
jaknap ramuk hgnis
*/
import java.util.Scanner;
class MyTest2{
	public String takeInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		String original=scan.nextLine();
		return original;
	}
	void revString(String original)
	{
	String temp="";
	String rev="";
		for(int i=0;i<original.length();i++){

			if(original.charAt(i) !=' ')
			{
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
	void startProgram(){
		String s=takeInput();
		revString(s);
	}
	public static void main(String args[]){
		MyTest2 test=new MyTest2();
		test.startProgram();
	}
}

