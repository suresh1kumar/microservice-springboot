package com.interview.logical;

public class CountDuplicateCharacters {
	
	public static void main(String[] args) {
		
		String up = " Sakkettaadaa appale aa ss ";
		String str=up.toUpperCase();
		int count[] = new int[256];
		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				char ch = (char) i;
				System.out.println("Number of Occurrence of " + ch + " is:" + count[i]);
			}
		}
		
			
	}

}
