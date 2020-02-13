#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int a,b,c,i,n;
a=0,b=1;
printf("\nEnter a No.:");
scanf("%d",&n);
printf("%3d",a);
printf("%3d",b);
for(i=1;i<=n;i++)
	{
		c=a+b;
		printf("%4d",c);
		a=b;
		b=c;
	}
getch();
}