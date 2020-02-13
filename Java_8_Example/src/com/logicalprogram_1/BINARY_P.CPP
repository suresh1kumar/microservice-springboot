#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,c=1,n=5;
for(i=0;i<=n;i++)
{
	for(j=i;j<n;j++)
	{
		printf("  ");
	}

	for(j=1;j<=2*i+1;j++)
	{
		if(c%2==0)
		printf(" 1");
		else
		printf(" 0");
		c++;
	}
printf("\n");
}
getch();
}