package com.logicalprogram_4;
import java.util.Scanner;
class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size:");
		int n=sc.nextInt();

		int a[][]=new int[n][n];
		int cmin=0,cmax=n-1;
		int rmin=0,rmax=n-1;
		int k=1;

while(k<=(n*n)){
		for(int i=cmin;i<=cmax;i++)
		{
			a[rmin][i]=k++;
		}
		for(int j=rmin+1;j<=rmax;j++)
		{
			a[j][cmax]=k++;
		}
		for(int p=cmax-1;p>=cmin;p--)
		{
			a[rmax][p]=k++;
		}
		for(int l=rmax-1;l>=rmin+1;l--)
		{
			a[l][rmin]=k++;
		}
		cmin++;
		rmin++;
		cmax--;
		rmax--;
}
for(int row=0;row<n;row++)
{
		
	for(int col=0;col<n;col++)
	{
		if(row==0 || row==n-1)
		System.out.print(a[row][col]+"    ");
		else
		System.out.print(a[row][col]+"   ");
	}
	System.out.println();
}

}
}
