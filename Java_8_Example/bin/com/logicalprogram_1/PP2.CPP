#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,k,n=5,c,a=5;
for(i=1;i<=n;i++)
{            c=1;
	for(j=i;j<n;j++)
	{
		printf("   ");
	}
	for(j=1;j<=2*i-1;j++)
	{
		if(j==1 || j==2*i-1)
		{
			printf("  %d",a);
		}
		else
		{
			printf("%3d",c);
			c++;
		}
	}
printf("\n");
}
getch();
}