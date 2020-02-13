#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,k;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	{
		printf("  ");
	}

	for(j=1;j<=i;j++)
	{
		printf("%2d",j);
	}
	k=i;
	for(j=k;j>1;j--)
	{
		printf("%2d",--k);
	}
printf("\n");
}
getch();
}