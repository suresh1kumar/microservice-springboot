#include<conio.h>
#include<stdio.h>
void pow(int n,int p) ;
void main()
{
clrscr();
int n,p;

printf("Enter No:");
scanf("%d",&n);
printf("Enter power:");
scanf("%d",&p);
pow(n,p);

getch();
}
void pow(int n,int p)
{
int ans=n;
int inc=n;
	for(int i=1;i<p;i++)
	{
		for(int j=1;j<n;j++)
		{
			ans=ans+inc;
		}
		inc=ans;
	}
printf("%d Power %d is : %d",n,p,inc);
}
