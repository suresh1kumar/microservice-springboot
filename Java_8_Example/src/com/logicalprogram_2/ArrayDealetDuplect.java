package com.logicalprogram_2;
class ArrayDealetDuplect{ 
	public static void main(String[] args) 
	{
		// out put : 12345
		int a[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,1,2};
		int no=a.length;
		int b[]=new int[no];
		for(int i=0;i<a.length;i++){
			boolean flag=true;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					flag=false;
					break;
				}
				
			}
			if(flag==true){
					System.out.print(a[i]);
				}
		}

	}
}
