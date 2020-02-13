package com.logicalprogram_3;
class Max_Min_Number 
{
	public static void main(String[] args) 
	{
		int arr[]={5,7,3,8,20,6,40,2,50};
		int max=arr[0];//5  ,1st position no
		int min=arr[0];//5  ,1st position no 
                        //9
		for(int i=1;i<arr.length;i++)
        {
           if(max<arr[i])
		   {
              max=arr[i];
           }
		   else if(min>arr[i])
		   {
              min=arr[i];
           }
		}
		System.out.println("Max no is "+max);
	    System.out.println("Min no is "+min);
	}
}
