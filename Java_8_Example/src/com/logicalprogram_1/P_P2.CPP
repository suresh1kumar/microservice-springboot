#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5;
for(i=1;i<=n;i++)
{
	for(j=1;j<=i;j++)
	{
		if(j%2==1)
		printf("1");
		else
		printf("0");
	}
printf("\n");
}
getch();
}