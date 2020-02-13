package com.logicalprogram_2;
import java.util.Scanner;
class  MyTest3
{
   public String takeInput(){
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter a String");
	   String original=scan.nextLine();
	    return original;
   }
    void revString (String original){
	   String temp="";
	   String rev="";
	   for(int i=original.length()-1;i>=0;i--){
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
   void startProgram(){
	   String s=takeInput();
	   revString(s);
   }

	public static void main(String[] args) 
	{
		MyTest3 test3=new MyTest3();
		test3.startProgram();
	}
}
