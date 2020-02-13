package com.logicalprogram_2;
import java.util.Scanner;
class  SnakeMatrix{

	public static void main(String[]args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no for row and col");
	   int no=sc.nextInt();
	   int a[][]=new int[no][no];
	   System.out.println("Enter value for matrix");
	   for(int i=0;i<no;i++){
		   for(int j=0;j<no;j++){
			   a[i][j]=sc.nextInt();
	}
}
for(int k=0;k<2*no-1;k++){
	for(int m=0;m<no;m++){
		for(int n=0;n<no;n++){
			if((m+n)==k){
				if((m+n)%2==0)
					System.out.print(a[m][n]+" ");
				else
                    System.out.print(a[n][m]+" ");
			}
		}
	}
}
	}
}