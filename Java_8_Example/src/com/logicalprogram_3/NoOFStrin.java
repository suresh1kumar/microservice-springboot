package com.logicalprogram_3;
class NoOFStrin
{
	public static void main(String args[])
	{
		String s="parshant kumar";
		String[] s2=s.split(" ");
		int len=0;
		for(String str:s2)
		{
			len++;
		}
		System.out.println(len);
	}
}