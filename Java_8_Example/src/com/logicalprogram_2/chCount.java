package com.logicalprogram_2;
/*
enter a string-->madam
m-----2
a-----2  
d-----1
*/
import java.util.Scanner;
class chCount
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		return s;
	}
	public void printCount(String s){
		int len=s.length();
		for(int i=0;i<len;i++){
			int count=0;
			boolean flag=true;
			for(int j=i;j<len;j++){
				for(int k=0;k<i;k++){
					if(s.charAt(k)==s.charAt(i)){
						flag=false;
						break;
					}
				}
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			if(flag==true){
				System.out.println(s.charAt(i)+"--------------------------"+count);
			}
		}
	}
	public void startProgram(){
		String s1=takeInput();
		printCount(s1);
	}
	public static void main(String args[]){
      chCount cc=new chCount();
	  cc.startProgram();
	}
 
};