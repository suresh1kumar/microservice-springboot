#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int a,b,c,i,n1,n2;
a=0,b=1;

printf("\nEnter a No.:");
scanf("%d",&n1);

printf("\nEnter a No.:");
scanf("%d",&n2);
if(n1==0||n1==1)
{
printf("%3d",a);
printf("%3d",b);
}
for(i=n1;i<=n2;i++)
	{
		c=a+b;
		if(c>=n1)
		printf("%4d",c);
		a=b;
		b=c;
	}
getch();
}