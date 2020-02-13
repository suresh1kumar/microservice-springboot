#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int rows=23,coloms,i,j,space;
coloms=rows;
int start=1,top=(rows*coloms)-((rows-2)*(coloms-2));
for(i=1;i<=rows;i++)
{
	if(i==1||i==rows)
		for(j=1;j<=rows;j++)
		{
			if(i==1)
			printf("%-3.2d",start++);
			else
			printf("%-3.2d",top--);
		}
	else
	{
		printf("%-3.2d",top--);
		for(int space=1;space<=rows-2;space++)
			printf("   ");
		printf("%-3.2d",start++);
	}
printf("\n");
}
getch();
}