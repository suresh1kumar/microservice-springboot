package com.logicalprogram_2;
/*
enter a String ->madam
m----2
a----2
d----1
*/
import java.util.Scanner;
class countChar
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String original=sc.next();
		return original;
	}
	public void charCount(String original){
		
		
		int len=original.length();
		for(int i=0;i<len;i++){
			int count=0;
			boolean flag=true;
			for(int j=i;j<len;j++){
				for(int k=0;k<i;k++){
					if(original.charAt(k)==original.charAt(i)){
						flag=false;
						break;
					}
				}
				if(original.charAt(i)==original.charAt(j)){
					count++;
				}
			}
		
		if(flag==true){
			System.out.println(original.charAt(i)+"-------------"+count);
		    }
	     }
     }
	 public void startProgram(){
		 String s=takeInput();
		 charCount(s);
	 }
	 public static void main(String args[]){
		 countChar cc=new countChar();
		 cc.startProgram();
	 }
};