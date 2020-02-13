package com.java8.comman;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0,b=1,c,i,count=10;
		System.out.println("<<FibonacciSeries>>::\n---------------------------");
		System.out.print(a+" "+b );
		
		for( i=1;i<count;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	
	}

}
