package com.logicalprogram_2;
class ArrayTest4 
{
	public static void main(String[] args) 
	{
		int s=0;
	    int a[]={2,4,6,4,3,13};
		int len=a.length;
		for(int i=0;i<len;i++){
		  for(int j=2;j<=a[i];j++){
			  if(a[i]%j==0)
				   break;
			  else
				  s=s+a[i];
		  }
		}
		System.out.println(s);
	}
}
