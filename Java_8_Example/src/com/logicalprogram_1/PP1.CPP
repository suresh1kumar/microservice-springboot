#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,k,n=5,c,a=65;
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
			printf("  %c",a);
		}
		else
		{
			printf("%3d",c);
			c++;
		}
	}
	a++;
printf("\n");
}
getch();
}