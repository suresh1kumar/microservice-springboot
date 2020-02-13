#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *str;
char c;
printf("\nEnter String :");
gets(str);
printf("\nEnter Character:");
getc(c);
int i=0;count=1;

while(str[i]!='\0')
{
	if(str[i]==c)
	count++;
i++;
}
printf("\nFraquency of Character : ",count);
getch();
}