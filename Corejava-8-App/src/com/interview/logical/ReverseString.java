package com.interview.logical;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//String str="java developer spring boot microservice";
		String str="H-e-l-l-o- -W-o-r-l-d";
		
		//String rev []=str.split("");
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("reve ::"+reverse);
		/*for(int i= rev.length-1;i>=0;i--) {
			System.out.print(rev[i]);
		}*/
		
		
		
		
		/*String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		
		System.out.println(reversedString);*/
		
	}

}
