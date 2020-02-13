#include<conio.h>
#include<stdio.h>
void fibo(int a,int b,int n);
void main()
{
clrscr();
int a,b,n;
a=0;
b=1;
printf("\nEnter A No:");
scanf("%d",&n);
printf("%3d",a);
printf("%3d",b);
fibo(a,b,n=n-2);
getch();
}
void fibo(int a,int b,int n)
{
int c;
	if(n>0)
	{
		c=a+b;
		printf("%3d",c);
		a=b;
		b=c;
		fibo(a,b,(--n));
	}
}