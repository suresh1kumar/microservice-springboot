#include<conio.h>
#include<string.h>
#include<stdio.h>
int search(char ch);
char *store;
void stroccurance(char *);
void main()
{
clrscr();
char *str;
printf("\nEnter String : ");
gets(str);
puts(str);
stroccurance(str);
getch();
}
void stroccurance(char *str)
{
	int count,flag,j=0;
	char ch;
	char *store;
	for(int i=0;str[i]!='\0';i++)
	{
		count=0;
		flag=0;
		for(int j=0;str[j]!='\0';j++)
		{
		     if(str[i]==str[j] && search(str[i])==0)
		     {
			count++;
			flag=1;
		     }
		}
		if(flag==1&&count>=0)
		{
			printf("\n %c : is occured %d times ",str[i],count);
		}
		store[j++]=str[i];
	}

}
int search(char ch)
{
	for(int i=0;i<strlen(store);i++)
	{
	    if(store[i]==ch)
	     return 1;
	}
	return 0;
}