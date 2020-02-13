#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,k,n=6,l;
i=1;
while(i<=n)
{
	j=i;
	while(j<=n-1)
	{
		printf("  ");
		j++;
	}
	k=1;
	while(k<=i)
	{
		printf(" *");
		k++;
	}
	l=1;
	while(l<i)
	{
		printf(" *");
		l++;
	}

i++;
printf("\n");
}
getch();
}