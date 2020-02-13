#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t=0;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	printf("  ");

	for(j=1;j<=2*i-1;j++)
	{
		if(i==1)
		printf("%2d",5);
		else
		printf("%2d",j);
	}
printf("\n");
}
getch();
}