#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int n1,n2,i,flage;
printf("\Enter First No:");
scanf("%d",&n1);
printf("\Enter Second No:");
scanf("%d",&n2);
if(n1<n2)
{
	for(int n=n1;n<n2;n++)
	{
		flage=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flage=1;
				break;
			}
		}
		if(flage==0)
		printf("%d:is prime",n);
		else
		printf("\t\t%d:not prime",n);
		printf("\n");
	}
}
else
{
	printf("Erroe: first No should be less then second No");
}
getch();
}