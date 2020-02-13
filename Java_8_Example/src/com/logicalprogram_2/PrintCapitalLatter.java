package com.logicalprogram_2;
import java.util.Scanner;
class PrintCapitalLatter 
{
	public String takeInput(){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a String");
	 String s=sc.nextLine();
	 return s;
	}
	public void PrintTitleCase(String s){
		int len=s.length();
		String str="";
		for(int i=0;i<len;i++){
			if(i==0){
				int j=(int)s.charAt(i);
				if(j>=65 && j<=90){
				str=str+(char)j;
				}
				else
				{
					str=str+((char)(j-32));
				}
			}
			else if(s.charAt(i)==' '){
				char k=s.charAt(i+1);
				if(k>=65 && k<=90){
				str=str+" "+(char)k;
				}
				else
				{
					str=str+" "+((char)(k-32));
				}
			}
			else if(s.charAt(i-1)==' ')
			{

			}
			else{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}

     public void startProgram(){
		 String s=takeInput();
		 PrintTitleCase(s);
	 }

	public static void main(String[]args) 
	{
		PrintCapitalLatter pcl=new PrintCapitalLatter();
		pcl.startProgram();
	}
}
