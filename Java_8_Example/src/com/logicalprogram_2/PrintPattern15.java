package com.logicalprogram_2;
import java.util.Scanner;
class  PrintPattern15
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int a[][]=new int [no][no];
		int c1=0,c2=no-1,r1=0,r2=no-1,k=1;
		while(no*no>=k){
		for(int i=c1;i<=c2;i++){
			a[r1][i]=k++;
			
		}
		for(int j=r1+1;j<=r2;j++){
		
			a[j][c2]=k++;
		}




		for(int p=c2-1;p>=c1;p--){
		
			a[r2][p]=k++;
		}





		for(int l=r2-1;l>=r1+1;l--){
		
			a[l][r1]=k++;
		}
         r1++;c1++;
		 r2--;c2--;


	}
	for(int row=0;row<no;row++){
		for(int col=0;col<no;col++){
			if(row==0 || row==no-1)
				System.out.print(a[row][col]+" ");
			else
				System.out.print(a[row][col]+" ");
		}
		System.out.println();
	}
}
}