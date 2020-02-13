#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,m;
m=n;
for(i=0;i<n;i++)
{
	for(j=1;j<i;j++)
	{
		printf(" ");
	}
	m=m-1;
	for(j=1;j<=2*m+1;j++)
	{
		printf("*");
	}
printf("\n");
}
getch();
}