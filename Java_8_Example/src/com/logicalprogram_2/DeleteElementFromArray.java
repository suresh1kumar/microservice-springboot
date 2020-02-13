package com.logicalprogram_2;
import java.util.Scanner;
class DeleteElementFromArray 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Array Size");
		int no=sc.nextInt();


		int a[]=new int[no];

		for(int i=0;i<a.length;i++){
			System.out.println("Enter value for array");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter element for deleting");
		int n=sc.nextInt();

       for(int i=0;i<a.length;i++){
		   		 
			if(a[i]==n){
				int index=i;
				for(int j=index;j<a.length-1;j++){
				    a[j]=a[j+1];
					}
					
					
				}
		 
		   
			}
			 for(int i=0;i<a.length-1;i++){
				 System.out.print(a[i]+" ");
			 }
		}
	}

