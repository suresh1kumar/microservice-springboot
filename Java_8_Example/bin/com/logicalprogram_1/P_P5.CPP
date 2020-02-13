#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=10,t=1;
for(i=n;i>=1;i--)
{
	for(j=n;j>=1;j--)
	{
		if(t==j)
		printf(" *");
		else
		printf("%2d",j);
	}
	t++;
printf("\n");
}
getch();
}
