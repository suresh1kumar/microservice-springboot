package com.interview.logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map.Entry;

public class c {
	
1).	CountDuplicateCharacters ::
		-----------------------
		String up = new String(" Sakkettaadaa appale aa ss ");
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
		
2).	CountDuplicateNo ::
			---------------
			int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };

			HashMap<Integer, Integer> map = new HashMap<>();
			for (int element : inputArray) {
				if (map.get(element) == null) {
					map.put(element, 1);
				} else {
					map.put(element, map.get(element) + 1);
				}
			}
			Set<Entry<Integer, Integer>> entrySet = map.entrySet();
			System.out.println("Duplicate Element \t\t  Found Time \n-------------------------------------------------");

			for (Entry<Integer, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(" \t" + entry.getKey() + "\t\t\t\t" + entry.getValue());
				}
			}
		}
		
3).  DuplicatNumberRemove ::
	 -------------------
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
	
	
4).  CharacterDuplicatNumberRemove ::
		 ----------------------------
	
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

5).   FibonacciSeries ::
	   --------------
	int a=0,b=0,c=1;
	int no=8;
	for(int i=0;i<no;i++) {
	a=b;
	b=c;
	c=a+b;
	System.out.print(a + " ");
	}
	
6). PrimeNumberAndNot ::
	-------------------
		int num=11;
		boolean isprime=true;
		int temp=0;
		
		for(int i=2;i<num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println(num + "prime number");
		}else {
			System.out.println(num + "Not prime number");
		}
		
7). RemoveDuplicateCharacters ::
	----------------------------
			String s = "aabbccdef";
			Set<Character> set = new LinkedHashSet<Character>();
			for (char c : s.toCharArray()) {
				set.add(Character.valueOf(c));
			}
			System.out.println(set.toString());
			for (char sw : set) {
				System.out.print(sw);
			}
			
8).  ReverseString ::
	-----------------
				String str="java developer spring boot microservice";
				//String rev []=str.split("");
				String reverse="";
				
				for(int i=str.length()-1;i>=0;i--) {
					reverse=reverse+str.charAt(i);
				}
				System.out.println("reve ::"+reverse);
				/*for(int i= rev.length-1;i>=0;i--) {
					System.out.print(rev[i]);
				}*/
				
9). SwapeTwoVarabileWithoutThirdVariable ::
	---------------------------------------
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
