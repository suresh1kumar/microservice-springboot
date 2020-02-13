#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int rows,coloms,i,j,space;
printf("Enter Number Of Rows:");
scanf("%d",&rows);
printf("Enter Number Of Colom:");
scanf("%d",&coloms);
int start=1,top=(rows*coloms)-((rows-2)*(coloms-2));
int top1=top;
printf("\n\n");
for(i=1;i<=rows;i++)
{
	if(i==1||i==rows)
		for(j=1;j<=coloms;j++)
		{
			if(i==1)
				printf("%-3.2d",start++);
			else
				printf("%-3.2d",top--);
		}
	else
	{
		printf("%-3.2d",top--);
		for(int space=1;space<=coloms-2;space++)
		{
			if(i-1==space)
			printf("%-3.2d",++top1);
			else
			printf("   ");
		}
		printf("%-3.2d",start++);
	}
printf("\n");
}
getch();
}