package com.logicalprogram_4;
import java.util.Scanner;
class  Fact_recu
{
	public int takeInput()
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=Integer.parseInt(sc.next());
		return no;
	}
	public int fact(int no)
	{
		if(no==0)
			return 1;
		else 
			return no*fact(no-1);
	}
	public void startProgram()
	{
		
		int no=takeInput();
		int f= fact(no);
		System.out.println(f);
	}
	public static void main(String[] args) 
	{
		Fact_recu f1=new Fact_recu();
		f1.startProgram();
	}
}
