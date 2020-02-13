#include<conio.h>
#include<stdio.h>
void nearestPrime(int);
int forwardPrime();
int backwardPrime();
static int count;
void main()
{
clrscr();
int inputNumber;
printf("\nEnter Number :");
scanf("%d",&inputNumber);
nearestPrime(inputNumber);
getch();
}
int forwardPrime(int inputNumber)
{
	int flage=0;
	for(int temp=2;temp<inputNumber/2;temp++)
	{
		if(inputNumber%temp==0)
		{
			flage=1;
			break;
		}
	}
	if(flage==0&&inputNumber>0)
		return inputNumber;
	else
		forwardPrime(++inputNumber);
}
int backwardPrime(int inputNumber)
{
	int flage=0;
	for(int temp=2;temp<inputNumber/2;temp++)
	{
		if(inputNumber%temp==0)
		{
			flage=1;
			break;
		}
	}
	if(flage==0&&inputNumber>0)
		return inputNumber;
	else
		backwardPrime(--inputNumber);
}

void nearestPrime(int inputNumber)
{
	int flage=0;
	for(int temp=2;temp<inputNumber/2;temp++)
	{
		if(inputNumber%temp==0)
		{
			flage=1;
			break;
		}
	}
	if(flage==0&&inputNumber>0&&count<=0)
		printf("\nPRIME");
	else
	{

		int fPrime=forwardPrime(++inputNumber);
		int bPrime=backwardPrime(--inputNumber);
		printf("\nNearest Prime Is : ");
		//printf("\n%d   %d",fPrime,bPrime);
		if((inputNumber-bPrime)<(fPrime-inputNumber))
		printf("%d",bPrime);
		else
		printf("%d",fPrime);
	}
}