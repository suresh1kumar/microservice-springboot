package com.logicalprogram_2;
class ArrayPrintUnionValue 
{
	public static void main(String[] args) 
	{
		int a[]={1,3,4,5,8};
		int b[]={8,5,3,5,7};
		int c[]=new int[a.length+b.length];
		int i;
		for(i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int j=0;j<=b.length-1;j++){
			c[i]=b[j];
			i++;
		}
		for(int k:c){
			System.out.print(k+" ");
		}

	}
}
