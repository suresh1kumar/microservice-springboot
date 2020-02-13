#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=20,t;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	{
		printf("  ");
	}

	t=i;
	for(j=1;j<=i;j++)
	{
		printf("%2d",t++);
	}

	t=t-2;
	for(int k=1;k<i;k++)
	{
		printf("%2d",t);
		t--;
	}
printf("\n");
}
getch();
}