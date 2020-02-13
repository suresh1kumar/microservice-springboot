package com.logicalprogram_4;
import java.util.Scanner;
public class MatrixAdjecent
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
	public void adjecentMatrix(int arr[][],int row,int col)
	{
		System.out.println("---------------------------");
		int rInd=0,cInd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element hows adjecent u want");
		int m=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(m==arr[i][j])
				{
					rInd=i;
					cInd=j;
					break;
				}
			}
		}

		if((rInd-1)>=0)
		{
			System.out.println("Top element is: "+arr[rInd-1][cInd]);
		}
		if((cInd+1)<row)
		{
			System.out.println("Right element is: "+arr[rInd][cInd+1]);
		}
		if((rInd+1)<col)
		{
			System.out.println("Bottom element is: "+arr[rInd+1][cInd]);
		}
		if((cInd-1)>=0)
		{
			System.out.println("Left element is: "+arr[rInd][cInd-1]);
		}
		

	}
	public void startProgram()
	{
		int row=inputMatrix();
		int col=inputMatrix();
		int arr[][]=initializedArray(row,col);
		printArray(arr,row,col);
		adjecentMatrix(arr,row,col);
	}

		public static void main(String[] args)
	{
			MatrixAdjecent rmObj=new MatrixAdjecent();
			rmObj.startProgram();
	}

}