package com.logicalprogram_2;
import java.util.Scanner;
class AsciiPrint 
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		return s;
	}
	public void pirntAscii(String s){
		int len=s.length();
		//char ch[]=s.toCharArray();
		for(int i=0;i<len;i++){
			System.out.println(s.charAt(i)+"--------->"+(int)s.charAt(i));
			//System.out.println(ch[i]+"--------->"+(int)ch[i]);
		}
	}
public void startProgram(){
	String s=takeInput();
	pirntAscii(s);
}

	public static void main(String[] args) 
	{
		AsciiPrint ap=new AsciiPrint();
		ap.startProgram();
	}
}
