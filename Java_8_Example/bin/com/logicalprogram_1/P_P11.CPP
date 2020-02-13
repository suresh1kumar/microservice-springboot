#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,t=65;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
	printf("  ");

	for(j=1;j<=2*i-1;j++)
	{
		if(i%2==0)
		printf("%2c",t++);
		else
		printf("%2d",j);
	}
printf("\n");
}
getch();
}