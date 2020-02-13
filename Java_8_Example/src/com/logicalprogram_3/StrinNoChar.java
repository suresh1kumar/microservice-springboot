package com.logicalprogram_3;
class StringTrim
{
	public static void main(String args[])
	{
       String s ="  What is ";
	   String str=s.trim();
                int i=0;
		try
		{	
			while(true)
			{
				str.charAt(i);
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("the length is " + i);
		}
    
	}
}