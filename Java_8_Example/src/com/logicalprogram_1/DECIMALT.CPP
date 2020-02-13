#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int b[30],d;
int i=0;
printf("\nEnter Number:");
scanf("%d",&d);

while(d>0)
{
b[i]=d%2;
d=d/2;
i++;
}
for(int j=i-1;j>=0;j--)
printf("%d",b[j]);

getch();
}