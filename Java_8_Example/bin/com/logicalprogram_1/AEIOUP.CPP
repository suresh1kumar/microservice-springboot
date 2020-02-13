#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,c=0,n=5;
char a[]={'a','e','i','o','u'};
for(i=n;i>=0;i--)
{
	for(j=n;j>i;j--)
	{
		printf("  ");
	}

	for(j=1;j<=2*i+1;j++)
	{
		if(c<=4)
		{
			printf(" %c",a[c]);
			c++;
		}
		else
		{
			c=0;
			printf(" %c",a[c]);
			c++;
		}
	}
printf("\n");
}
getch();
}