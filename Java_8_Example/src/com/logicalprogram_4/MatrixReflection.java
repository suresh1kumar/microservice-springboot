package com.logicalprogram_4;
import java.util.Scanner;
public class MatrixReflection
{
	public int inputMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		return n;
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

	
	public String reflection1(int arr[][],int row, int col)
	{
		for(int i=row-1; i>=0; i--)
		{
			for(int j=0; j<col; j++)
		        {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
		}
		//return "";
	}

	public String reflection2(int arr[][],int row,int col)
	{
		for(int i=0; i<row; i++)
		{
			for(int j=col-1; j>=0; j--)
		        {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
		}
		//return "";
	}

	public void checkReflectionMatrix(int arr[][],int row,int col)
	{
		System.out.println("Left Reflection :"+reflection2(arr,row,col));
		System.out.println("Right Reflection :"+reflection2(arr,row,col));
		System.out.println("Top Reflection :"+reflection1(arr,row,col));
		System.out.println("Buttom Reflection :"+reflection1(arr,row,col));
	}

	public void startProgram()
	{
		int row=inputMatrix();
		int col=inputMatrix();
		int arr[][]=initializedArray(row,col);
		printArray(arr,row,col);
		checkReflectionMatrix(arr,row,col);
	}

		public static void main(String[] args)
	{
			MatrixReflection rmObj=new MatrixReflection();
			rmObj.startProgram();
	}

}