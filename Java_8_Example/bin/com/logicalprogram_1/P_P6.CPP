#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t=1,m;
m=n-2;
for(i=0;i<n-1;i++)
{
	for(j=1;j<=i+1;j++)
		printf("%2d",t++);

	for(j=1;j<=2*m;j++)
		printf(" *");

	for(j=1;j<=i+1;j++)
		printf("%2d",--t);
m--;
printf("\n");
}
getch();
}