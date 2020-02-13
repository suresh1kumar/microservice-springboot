#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *str;
int j=0,f=0;
printf("\nEnter String :");
gets(str);
for(int i=0;str[i]!='\0';i++)
{
	if(str[i]==str[i+1])
	{
		continue;
	}
	else
	{
		str[j]=str[i];
		j++;
	}
}
str[j]='\0';
printf("String is : %s",str);
getch();
}