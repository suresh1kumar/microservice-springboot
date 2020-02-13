package com.logicalprogram_2;
/* input:i love my india
output:I Love My India*/
import java.util.Scanner;
class CapitalFirstLetter{
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String s1=sc.nextLine();
		int len=s1.length();
		char c1[]=s1.toCharArray();
	    for(int i=0;i<len;i++){
			if(i==0){
				if(c1[i]>=97 && c1[i]<=122){ 
				c1[i]=(char)(c1[i]-32);
			    }
			}
			else if(c1[i]==' '){
			   if(c1[i+1]>=97 && c1[i+1]<=122){
				c1[i+1]=(char)(c1[i+1]-32);
				}
			}	
			else if(c1[i-1]!=' '){
				if(c1[i]>=65 && c1[i]<=90){
					c1[i]=(char)(c1[i]+32);
				}
            }
		}
		    for(int i=0;i<len;i++){
			System.out.print(c1[i]);
			}
		}
    }
