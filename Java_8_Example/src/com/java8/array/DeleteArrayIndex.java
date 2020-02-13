package com.java8.array;

public class DeleteArrayIndex {
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("===================================");
		int a[]= {10,40,30,80,60,20,10,10};
		int del=300;
		for(int i=0;i<a.length;i++) {
			if(del==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				count=count+1;
				break;
				
			}
		}
		if(count==0) {
			System.out.println("Element not found...");
		}else {
			System.out.print("\n===================================\nout put :");
			for(int i=0;i<a.length-1;i++) {
				
				System.out.print(a[i]+ " ");
			}
		}
		
		
	}

}
