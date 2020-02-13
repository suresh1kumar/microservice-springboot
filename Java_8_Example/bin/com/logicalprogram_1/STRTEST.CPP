#include<conio.h>
#include<stdio.h>
void strreverce(char *str);
void main()
{
clrscr();
char *str;
printf("\nEnter String : ");
gets(str);
printf("\nString is : ");
puts(str);
strreverce(str);
getch();
}
void strreverce(char *str)
{
	char c;
	for(int i=0;str[i]!='\0';i++);
	printf("Len : %d",i);
	for(int j=0;j<=i/2;j++)
	{
		c=str[j];
		str[j]=str[i-j-1];
		str[i-j-1]=c;
	}
	printf("\nRev String is : %s ",str);
}