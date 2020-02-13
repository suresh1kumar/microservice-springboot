package com.logicalprogram_4;
import java.util.Scanner;
public class MaggicMatrix
{
	public int inputMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		return n;
	}
	public void printArray(int arr[][],int row,int col)
	{
		System.out.println("Matrix is: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public int[][] initializedArray(int row,int col)
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[row][col];
		System.out.println("Enter the element in array:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}

		}
		return arr;

	}
	public void startProgram()
	{
		int row=inputMatrix();
		int col=inputMatrix();
		int arr[][]=initializedArray(row,col);
		printArray(arr,row,col);
		checkMaggic(arr,row,col);
	}

	public void checkMaggic(int arr[][],int row, int col)
	{
		int num=row,d1=0,d2=0,rows,cols;
		int rowsum[]=new int[row];
		int colsum[]=new int[col];
		for(int i=0;i<row;i++)
		{
			rows=0;cols=0;
			for(int j=0;j<col;j++)
			{
				rows=rows+arr[i][j];
				cols=cols+arr[j][i];
				
			}

			rowsum[i]=rows;
			//System.out.print(rowsum[i]);
			colsum[i]=cols;
			//System.out.print(colsum[i]);
			//System.out.print(d1);
		//System.out.print(d2);

		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
				 d1=d1+arr[i][j];
				}
				if((i+j)==num-1)
				{
					d2=d2+arr[i][j];
				}
			

				System.out.println(d1);
				System.out.println(d2);
		}
	}
		
		
		boolean flag=false;

		for(int i=0;i<row;i++)
		{
			if((rowsum[i]==colsum[i]) && (d1==rowsum[i]) && (d2==rowsum[i]))
			{
				flag=true;
			}
			else
				flag=false;
			
		}

	if(flag==true)
		System.out.println("Entered matrix is Maggical matrix");
	else
		
	System.out.println("Entered matrix is not- Maggical Matrix");

	
}

	

		public static void main(String[] args)
	{
			MaggicMatrix rmObj=new MaggicMatrix();
			rmObj.startProgram();
	}

}
