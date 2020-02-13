#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,temp1=1,temp2,n=5;
for(i=1;i<=n;i++)
{
	for(j=i;j<n;j++)
		printf("  ");

	for(j=1;j<=2*i-1;j++)
	{
		if(temp1<=9)
		{
			printf("%2d",temp1);
			temp1++;
			if(temp1==9)
			temp2=temp1-1;
		}
		else
		{
			printf("%2d",temp2);
			temp2--;
			if(temp2==1)
			temp1=temp2;
		}
	}
printf("\n");
}
getch();
}