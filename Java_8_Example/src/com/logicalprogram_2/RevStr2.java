package com.logicalprogram_2;
/*
nacre software services
ercan erawtfos secivres
*/
import java.util.Scanner;
class RevStr2{
     public String takeInput(){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a String");
		 String original=sc.nextLine();
		 return original;
	 }
	 public void printString(String original){
		 String temp="";
		 String rev="";
		 int len=original.length();
		 for(int i=0;i<=len-1;i++){
			 if(original.charAt(i) !=' '){
				 temp=original.charAt(i)+temp;
			 }
			 else{
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
		 RevStr2 rs2=new RevStr2();
		 rs2.startProgram();
	 }
}
