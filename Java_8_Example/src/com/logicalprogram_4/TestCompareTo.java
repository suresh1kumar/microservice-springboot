package com.logicalprogram_4;
class TestCompareTo
{
	public static void main(String[] args)
  {
   //String class equals() executed
	String s1="ratan";
	String s2="anu";
	String s3="ratan";
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equals(s3));//true
	System.out.println(s3.equals(s2));//false
	System.out.println("RATAN".equals("ratan"));//false
	System.out.println("RATAN".equalsIgnoreCase("ratan"));//true
	 
	 //compareTo()----int
	 System.out.println(s1.compareTo(s2));//+ve
	 System.out.println(s1.compareTo(s3));//0
	 System.out.println(s2.compareTo(s3));//-ve

	 System.out.println("RATAN".compareTo("ratan"));//-ve
	 System.out.println("RATAN".compareToIgnoreCase("ratan"));//0
    }
}