package com.logicalprogram_3;
class Strinlen2
{
	public static void main(String args[])
	{
		String str="A String"; 
        char str1[]=str.toCharArray(); 
        int i=0; 
        for(char s : str1)
	    { 
             i++; 
        } 
        System.out.println("Length =" + i); 
	}
}