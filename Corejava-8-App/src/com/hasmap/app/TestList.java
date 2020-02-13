package com.hasmap.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestList {

	
	public static void main(String[] args) {
		
		String rev="";
		String str="ramisgoodboyand";
		//String str1[]=str.split("");
		System.out.println("\n------------------");
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.print(rev );
		System.out.println("\n");
		int num[]= {3, 2, 2, 3, 7, 3, 5};
		
		int l[]=Arrays.stream(num).distinct().toArray();
		for(int a:l) {
			System.out.print(a+" ");
		}
		
		System.out.println("for remove array string using java 8 features");
		String stword[]= {"ds","ds","ew","ew","ew","ew","tr","rt","tr"};
		
		Object obj[]=Arrays.stream(stword).distinct().toArray();
	
		System.out.println("\n---------------------------------\n");
		for(Object aa:obj) {
			System.out.print(aa+" ");
		}
		
		
		//--------------------------------------------------
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5,1,2,3); 
		  
        System.out.println("\nThe distinct elements are :"); 
        long Count = list.stream().distinct().count(); 
        Object Count1 []= list.stream().distinct().toArray(); 
        
        for(Object aa:Count1) {
			System.out.print(aa+" ");
		}
        System.out.println("count ::"+Count);
	}
}
