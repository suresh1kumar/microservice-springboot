#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t;
for(i=n;i>=1;i--)
{

	for(j=n;j>i;j--)
	{
		printf("%d",t) ;
		t++;
	}
	for(j=i;j>=1;j--)
	{
		printf("%d",n);
	}
	printf("\n");
}
getch();
}