#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i=1,j,n=5,k;
while(i<=n)
{
	j=i;
	while(j<=n-1)
	{
		printf(" ");
		j++;
	}

	k=1;
	while(k<=i)
	{
		printf("%d",k);
		k++;
	}
i++;
printf("\n");
}
getch();
}