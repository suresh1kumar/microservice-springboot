package com.logicalprogram_2;
import java.util.Scanner;
class  PrintPosition
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.nextLine();
		return original;
	} 
	public void printPosition(String original){
		char c[]={'1','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int len=original.length();
		for(int i=0;i<=len-1;i++){
			char temp=original.charAt(i);
			for(int j=0;j<=c.length-1;j++){
				char p=c[j];
				if(temp==p){
					System.out.println(temp+"---------->"+j);
				}
			}
		}
	}
	public void startProgram(){
		String s=takeInput();
		printPosition(s);
	}
	public static void main(String []args) 
	{
		PrintPosition pp=new PrintPosition();
		pp.startProgram();
	}
}
