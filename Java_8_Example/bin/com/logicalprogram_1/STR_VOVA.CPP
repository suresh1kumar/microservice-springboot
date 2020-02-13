#include <stdio.h>
#include <malloc.h>
#include<conio.h>
#include <string.h>

int search( char * arr, char item );

char* removeDup(char * input)
{
    char *res = (char*)malloc(strlen(input)+1);
    int i = 0,j=0  ;

    for(i=0;input[i] != '\0';i++)
    {
	if (search(res,input[i]) == 0)
	    res[j++] = input[i];
    }
    return res;
}

int search( char * arr, char item )
{
    int i;
    for(i = 0 ;arr[i]!='\0' ; i++)
	if(item == arr[i])
	    return 1;
    return 0;
}

int main()
{
  clrscr();
  char input[200];

  printf("\nEnter a string : ");
  scanf("%s",input);

  printf("\nOutput : %s\n" , removeDup(input));
  getch();
}