package com.logicalprogram_3;
class Strinlen
{
	public static void main(String args[])
	{
       String s = "What is";
                int i=0;
		try
		{	
			while(true)
			{
				s.charAt(i);
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("the length is " + i);
		}
    
	}
}