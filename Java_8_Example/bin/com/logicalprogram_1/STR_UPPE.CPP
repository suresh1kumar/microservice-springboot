#include<conio.h>
#include<stdio.h>
void upper(char *str);
void main()
{
clrscr();
char *str;
printf("\nEnter String :");
gets(str);
upper(str);
printf("\nString in Upper : %s",str);
getch();
}
void upper(char *str)
{
	for(int i=0;str[i]!='\0';i++)
	{
		if(str[i]>='a'&&str[i]<='z')
		{
			str[i]==str[i]-32;
		}
	}
}