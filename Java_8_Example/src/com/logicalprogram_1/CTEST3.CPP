#include<conio.h>
#include<stdio.h>
#include<string.h>
void main()
{
clrscr();
char *s;
char *fun();
s=fun();
printf("%s\n",s);
getch();
}
char *fun()
{
char b[30];
strcpy(b,"RAM");
return (b);
}