package com.interview.logical;

import java.util.Arrays;

public class DuplicatNumberRemove {
	
	public static void main(String[] args) {
		
		int rem[]= {10,5,10,5,54,76,76,2,2,2,3,5,3,3,3,8,9,8};
		System.out.println("\nBefore printing those removing duplicate \n");
		for(int i:rem) {
			System.out.print(i + " ");
		}
		int afterrem []= Arrays.stream(rem).distinct().toArray();
		System.out.println("\nAfter printing those removing duplicate\n ");
		for(int i:afterrem) {
			System.out.print(i +" ");
		}
		
		
		
		
		
		
		String strem[]= {"aa","ram","sita","bb","ram","sita","aa","cc","dd","cc","dd"};
		System.out.println("\nBefore printing those removing duplicate char \n");
		for(String i:strem) {
			System.out.print(i + " ");
		}
		Object strafterrem []= Arrays.stream(strem).distinct().toArray();
		System.out.println("\nAfter printing those removing duplicate\n ");
		for(Object su:strafterrem) {
			System.out.print(su +" ");
		}
	}
	
	
	int a[]= {21,32,21,12,12};
	
	int ar[]=Arrays.stream(a).distinct().toArray();
	for(int a:ar) {
		
	}

}
