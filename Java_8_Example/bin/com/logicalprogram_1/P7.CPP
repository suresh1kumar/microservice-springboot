#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,n=5,c=0;
for(i=0;i<n;i++)
{
	for(j=i;j<n;j++)
	{
		printf(" ");
	}
	for(j=1;j<=2*i+1;j++)
	{
		if(i<3)
		{
			c++;
			printf("%d",c);
		}
		else if(i==3)
		{
			c--;
			printf("%d",c);
		}
		else
		{
			printf("%d",c);
			c++;
		}
	}
printf("\n");
}
getch();
}