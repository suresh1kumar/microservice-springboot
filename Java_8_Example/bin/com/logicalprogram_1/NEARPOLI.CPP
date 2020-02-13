#include<conio.h>
#include<stdio.h>
int nearestPolim(int);
int polim(int);
void main()
{
clrscr();
int inputNumber;
printf("\nEnter Number :");
scanf("%d",&inputNumber);
if(polim(inputNumber)==1)
printf("\nPolimdrom");
else
printf("Polim : %d",nearestPolim(inputNumber));
getch();
}
int polim(int n)
{
	int rn=0,n1=n;
	while(n>0)
	{
		rn=rn*10+n%10;
		n=n/10;
	}
	if(rn==n1)
		return 1;
	else
		return 0;
}
int nearestPolim(int n)
{
int fp=n;
int bp=n;
int polim1=0;
	while(1)
	{
		if(polim(++fp)==1)
		 {
			polim1=fp;
			break;
		 }
		 if(polim(--bp)==1)
		 {
			polim1=bp;
			break;
		 }
	}
	return polim1;
}