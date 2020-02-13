#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *str,*str1;
int j=0;

printf("\nEnter String :");
gets(str);

for(int l=0;str[l]!='\0';l++);

for(int i=l/2;str[i]!='\0';i++)
{
	str1[j]=str[i];
	j++;
}

str[l/2]='\0';
str1[j]='\0';
printf("\nString1 is : %s",str);
printf("\nString2 is : %s",str1);
getch();
}