package com.logicalprogram_2;
import java.util.Scanner;
class  SearchWord
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a string");
	  String str=sc.nextLine();

	  System.out.println("Enter a word");
	  String word=sc.next();
	  int wlen=word.length();
	  int count=0;
	  String temp="";
	  boolean flag=false;
	  int len=str.length();
	  for(int i=0;i<len;i++){
		  if(str.charAt(i)!=' '){
			  temp=temp+str.charAt(i);
		  }else
		  {
			  if(word.length()==temp.length()){
			    for(int j=0;j<wlen;j++){
				    if(word.charAt(j)==temp.charAt(j)){
					flag=true;
					System.out.println("hello");
					}
					else{
						System.out.println("hii");
						flag=false;
					
					}
				
				}

			  }
		  }
		  if(flag==true){
		   count++;
		   flag=false;
		  }

	  }
	  System.out.println(count);
	  
	 
	}
}
