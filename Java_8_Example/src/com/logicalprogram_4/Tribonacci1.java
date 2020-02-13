package com.logicalprogram_4;
import java.util.Scanner;
class Tribonacci1 
{	
	public int takeInput()
	{
		 int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		count=Integer.parseInt(sc.next());
		return count;
	}
	public void trib(int count)
	{
		int num1,num2,num3,t=0;
		num1=0;
		num2=1;
		num3=1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		for(int i=0;i<=count;i++)
		{	
			if(t < count)
			{
			t=num1+num2+num3;
			System.out.println(t);
			num1=num2;
			num2=num3;
			num3=t;
			count=count+1;
		
			}
			else
				break;
		}



	}
	public void startProgram()
	{
		int count=takeInput();
		trib(count);
	}

	public static void main(String[] args) 
	{
	
		Tribonacci1 obj1= new Tribonacci1();
		obj1.startProgram();
		
	}
}
