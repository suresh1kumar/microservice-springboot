package com.logicalprogram_4;
import java.util.Scanner;
class Tribonacci 
{	
	public int takeInput()
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		no=Integer.parseInt(sc.next());
		return no;
	}
	public void trib(int no)
	{
		int num1,num2,num3,t;
		num1=0;
		num2=1;
		num3=1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		for(int i=1;i<=no;i++)
		{	
			t=num1+num2+num3;
			System.out.println(t);
			num1=num2;
			num2=num3;
			num3=t;
		}

	}
	public void startProgram()
	{
		int no=takeInput();
		trib(no);
	}

	public static void main(String[] args) 
	{
	
		Tribonacci obj1= new Tribonacci();
		obj1.startProgram();
		
	}
}
