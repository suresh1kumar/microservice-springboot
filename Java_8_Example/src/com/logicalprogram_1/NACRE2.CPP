#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5;

for(i=n;i>=1;i--)
{
	for(j=i;j<=n;j++)
	printf(" *");
	for(j=1;j<=2*i-2;j++)
	printf("  ");
	for(j=i;j<=n;j++)
	printf(" *");
printf("\n");
}
--n;
for(i=1;i<=n;i++)
{
	for(j=i;j<=n;j++)
	printf(" *");
	for(j=1;j<=2*i;j++)
	printf("  ");
	for(j=i;j<=n;j++)
	printf(" *");
printf("\n");
}

getch();
}