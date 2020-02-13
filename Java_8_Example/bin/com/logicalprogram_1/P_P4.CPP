#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t=1;
for(i=0;i<n-1;i++)
{
	for(j=1;j<n-i;j++)
		printf("%2d",t++);

	for(j=1;j<=2*i;j++)
		printf(" *");

	for(j=1;j<n-i;j++)
		printf("%2d",--t);

printf("\n");
}
getch();
}