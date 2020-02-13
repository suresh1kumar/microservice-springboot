#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char *str1,*str2;
int j=0;
printf("\nEnter first String :");
gets(str1);
printf("\nEnter first String :");
gets(str2);

for(int l=0;str1[l]!='\0';l++);

for(int i=0;str2[i]!='\0';i++)
{
	str1[l]=str2[i];
	l++;
}
str1[l]='\0';
printf("\nString is : %s",str1);
printf("\nLength is : %d",l);
getch();
}