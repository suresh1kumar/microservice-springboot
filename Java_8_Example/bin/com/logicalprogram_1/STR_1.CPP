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
scanf("%c",&c);
int i=0,count=0;
while(str[i]!='\0')
{
	if(str[i]==c)
	count++;
i++;
}
printf("\nFraquency of Character : %d",count);
getch();
}