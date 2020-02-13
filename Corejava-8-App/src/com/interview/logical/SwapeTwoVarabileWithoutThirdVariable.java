package com.interview.logical;

public class SwapeTwoVarabileWithoutThirdVariable {
	
	public static void main(String[] args) {
		int temp;
		int a=5,b=9;
		/*temp=a;
		a=b;
		b=temp;
		System.out.println(a + " "+b);*/
		
		a=a+b;  //5+9=14
		b=a-b;  //14-9=5
		a=a-b;  //14-5=9
		System.out.println(a + " "+b);
		
	}

}
