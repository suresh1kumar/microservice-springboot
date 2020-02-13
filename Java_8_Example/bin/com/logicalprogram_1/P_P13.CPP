#include<conio.h>
#include<stdio.h>

void main()
{
clrscr();
int i,j,n=5;
for(i=n;i>=1;i--)
{
	for(j=i;j<n;j++)
		printf("  ");

	for(j=1;j<=i;j++)
		printf("%2d",j);

	int t=j-2;
	for(j=1;j<i;j++)
	{
		printf("%2d",t);
		t--;
	}

printf("\n");
}
getch();
}