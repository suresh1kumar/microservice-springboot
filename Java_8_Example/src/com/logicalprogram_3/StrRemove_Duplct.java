package com.logicalprogram_3;
import java.util.Scanner;

class StrRemove_Duplct
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);

	  /*System.out.println("Enter String element");
        String tr=sc.nextLine();*/
       // int len=tr.length();
	   String tr="madammadam";
        boolean  flag;
		 int count;

	    char ch[]=tr.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			 count=0;flag=false;

			 for(int j=0;j<i;j++)
			 {

				if(ch[i]==ch[j])
				{
					flag=true;
					break;
				}
			 }
			if(flag==false){
				for(int k=i;k<ch.length;k++){

					if(ch[i]==ch[k])
                       count++;
             }
			   System.out.println(ch[i]+" "+count);
			} 
		}
	}
}
