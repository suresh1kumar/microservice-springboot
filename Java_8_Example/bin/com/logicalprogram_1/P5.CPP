#include<conio.h>
#include<stdio.h>
void main()
{
	clrscr();
	int i,j,k,n=5;
	int m=n;
	for(i=0; i<n;i++)
	{
			for(j=0;j<i;j++)
			{
				printf(" ");
			}
			m=m-1;
			for(j=1;j<=2*m+1;j++)
			{
				printf("*");
			}

	printf("\n");
	}
getch();
}