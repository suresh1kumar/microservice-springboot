package com.logicalprogram_4;
class TestTrim 
{
	public static void main(String[] args) 
	{
		String str="ratana";
        System.out.println(str.charAt(2));
		//System.out.println(str.charAt(20)); //SIOBE
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));

		/*String str1="07R81A0525";
		System.out.println(str1.contains("07R"));
		System.out.println(str1.startsWish("07R"));
		System.out.println(str1.startsWish("07Reee"));
		System.out.println(str1.endsWith("525"));*/

		System.out.println("ratan".toUpperCase());
		System.out.println("RATAN".toLowerCase());
		String s1="   ratan   ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());

		String s2="ratansoft";
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,6));
		System.out.println(s2.substring(2,6).length5());

		String s3="hi chandan how r u";
		String[] ss = s3.split(" ");
		for (String sss : ss )
		{
			System.out.println(sss);
		}
	}
}
