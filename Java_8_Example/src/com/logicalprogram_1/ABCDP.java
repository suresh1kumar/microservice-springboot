package com.logicalprogram_1;
#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,k,n=5,c=1,a=65;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	{
		printf("   ");
	}
	c=i-1;
	for(j=1;j<=2*i-1;j++)
	{
		if(j%2!=0)
		{
			printf("  *");
		}
		else
		{
			printf("%3d",c);
		}
	}
printf("\n");
}
getch();
}