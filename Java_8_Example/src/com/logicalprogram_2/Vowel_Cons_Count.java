package com.logicalprogram_2;
import java.util.Scanner;
class Vowel_Cons_Count 
{
	public String takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		return s;
	}
	public void Count_Vowel_Cons(String s){
		int len=s.length();
		int vowel=0;
		int cons=0;
		for(int i=0;i<len;i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				vowel++;
			}else{
				cons++;
			}
	
		}
	System.out.println(vowel);
	System.out.println(cons);
	}
	public void startProgram(){
		String s=takeInput();
		Count_Vowel_Cons(s);
	}
	public static void main(String[] args) 
	{
		Vowel_Cons_Count vcc=new Vowel_Cons_Count();
		vcc.startProgram();
	}
}
