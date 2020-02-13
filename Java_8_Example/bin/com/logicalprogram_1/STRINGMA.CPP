#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
char str[10]="wellcome";
int i;
for(i=0;str[i]!='\0';i++)
puts(str+i);
getch();
}