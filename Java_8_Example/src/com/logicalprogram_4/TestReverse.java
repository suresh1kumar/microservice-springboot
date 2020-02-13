package com.logicalprogram_4;
class  TestReverse
{
	public static void main(String[] args) 
	{
		//String to StringBuffer
		String str="ratan";
		StringBuffer sb = new StringBuffer(str); 
		System.out.println(sb.reverse());

		//StringBuffer to String
		StringBuffer sb1 = new StringBuffer("durga");
		String ss =sb1.toString();
		System.out.println(ss);
	}
}
/*natar
durga*/