package com.logicalprogram_2;
class ArrayPrintCommanValue{ 

	public static void main(String []args) 
	{
		//comman value :4 7 9 
		int a[]={1,3,5,4,7,9};
		int b[]={2,6,4,7,9};
        
		int count=0;
		int c[]=new int[a.length];


        for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
				{
             c[count]=a[i];
			 count++;
				}

			}
		}
		for(int k=0;k<count;k++){
			System.out.print(c[k]+" ");
		}
	}
}
