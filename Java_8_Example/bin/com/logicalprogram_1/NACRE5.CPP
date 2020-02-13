#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int rows,i,j,n=5;
for(i=1;i<=5;i++)
{
	if(i==1||i==5)
		for(j=1;j<=n;j++)
			printf(" *");
	else
	{
		printf(" *");
		for(j=1;j<=n-2;j++)
			printf("  ");
		printf(" *");
	}
printf("\n");
}
getch();
}