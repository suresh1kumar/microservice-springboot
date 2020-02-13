package com.logicalprogram_3;
class PrimeExample{  
 public static void main(String args[]){  
  int i,m=0,flag=0;    
  int number=17;//it is the number to be checked  
  m=number/2;    
   for(i=2;i<=m;i++)
   {    
     if(number%i==0)
	 {    
      System.out.println("Number is not prime");    
      flag=1;    
      break;    
     }    
   }    
   if(flag==0)    
   System.out.println("Number is prime");    
  }  
}  