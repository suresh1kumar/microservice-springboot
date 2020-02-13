#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int i,j,k,n=5;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	{
		printf(" ");
	}

	for(j=1;j<2*i+1;j++)
	{
		printf("*");
	}

printf("\n");
}
getch();
}