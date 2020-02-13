#include<conio.h>
#include<stdio.h>
long int factorial(int n);
void main()
{
clrscr();
int n;
long int fact;
printf("\nEnter No:");
scanf("%d",&n);
fact=factorial(n);
printf("\nFactorial Is : %ld",fact);
getch();
}
long int factorial(int n)
{
	int f=1;
	if(n<=0)
		return f;
	else
		return  n*factorial(n-1);
}