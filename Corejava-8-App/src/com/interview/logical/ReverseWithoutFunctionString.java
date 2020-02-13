package com.interview.logical;

public class ReverseWithoutFunctionString {

	public static void main(String[] args) {
		
		String str="H-e-l-l-o- -W-o-r-l-d";
		String words[] = str.split(" ");
        String reversedString = "";
 
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 2; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + reversedString);
    }
	
}
