#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int n,flage=0;
printf("\nEnter a No : ");
scanf("%d",&n);
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		flage=1;
		break;
	}
}
if(flage==0)
printf("Prime ");
else
printf("not prime");
getch();
}