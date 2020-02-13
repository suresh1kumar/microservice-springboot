#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int r=10,i,k,s,n;
for(i=0;i<r;i++)
{
printf("\n");
	for(s=40-3*i;s>=1;s--)
	    printf(" ");

	for(k=0;k<=i;k++)
	{
		if(k==0)
		n=1;
		else
		n=((i-k+1)*n)/k;
		printf("%6d",n);
	}
}
getch();
}