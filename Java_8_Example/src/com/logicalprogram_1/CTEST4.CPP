#include<conio.h>
#include<stdio.h>
#include<string.h>
void display(int num,...);
void main()
{
clrscr();
display(4,'A','a','b','c');
}
void display(int num,...)
{
char c;int j;
va_list ptr;
va_start(ptr,num);
for(j=1;j<=num;j++)
{
c=va_arg(ptr,char);
printf("%c",c);
}
}

