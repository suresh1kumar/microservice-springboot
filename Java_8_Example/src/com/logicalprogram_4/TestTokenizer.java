package com.logicalprogram_4;
import java.util.*;
class TestTokenizer
{
	public static void main(String[]args)
	{
      StringTokenizer st= new StringTokenizer("hi ratan how are you");
	  while(st.hasMoreElements())
		{
       System.out.println(st.nextElement());
	  }
	  StringTokenizer st1= new StringTokenizer("hi rat,an ho,w r u",",");
	  while(st1.hasMoreElements())
		{
		  System.out.println(st1.nextElement());
	  }
	}
}
/*hi
ratan
how
are
you
hi rat
an ho
w r u*/
