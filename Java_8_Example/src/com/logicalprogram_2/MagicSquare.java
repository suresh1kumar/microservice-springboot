package com.logicalprogram_2;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[][] board = new int[n][n]; //automatically initialized with '0'

        int row = 0; // start with first row
        int col = n/2; //middle element
        int num = 1;  // number to be filled
  // n X n grid contains n^2 numbers
        while ( num <= n*n )
        {
            board[row][col] = num;
            num++;

   //increment column, when reaches last, start from the beginning
            int tempCol = (col + 1)%n;
   //decrement row, when last row is reached, move to the first
            int tempRow = (row - 1) >= 0 ? row-1 : n-1;
   
   //If the target cell is not empty, move to next row
            if( board[tempRow][tempCol] != 0 )
            {
                row = (row+1)%n;
            }
            else
            {
                row = tempRow;
                col = tempCol;
            }
        }
  //print the magix square
        for( int i = 0 ; i < n ; i++)
        {
            for( int j = 0 ; j < n ; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}