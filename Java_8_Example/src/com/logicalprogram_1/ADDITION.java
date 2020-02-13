package com.logicalprogram_1;
#include <stdio.h>
#include<conio.h>
#include <string.h>

int search( char *arr, char item );
void removeDup(char *input)
{
    char *res;
    int j=0  ;
    for(int i=0;input[i] != '\0';i++)
    {
	if (search(res,input[i]) == 0)
	    res[j++] = input[i];
    }
      printf("\n%s",res);
}

int search( char * arr, char item )
{
    for(int i = 0 ; i < strlen(arr) ; i++)
	if(item == arr[i])
	    return 1;
    return 0;
}

int main()
{
  clrscr();
  char *input;
  printf("\nEnter a string : ");
  scanf("%s",input);
  removeDup(input);
  getch();
}