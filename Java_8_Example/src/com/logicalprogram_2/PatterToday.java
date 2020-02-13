package com.logicalprogram_2;
class PatterToday 
{

	public static void main(String[] args) 
	{
		int no=5;
	     int count=no+1;

		for(int row=1;row<=no;row++){
				System.out.println();
	        	count=count-row;

			for( int col=1;col<=row;col++){
				System.out.print(count+" ");
				count++;
			}
			
			
			
		}
		
	}
}
