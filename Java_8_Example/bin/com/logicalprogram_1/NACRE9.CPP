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
//int start=1,top=(rows*coloms)-((rows-2)*(coloms-2));
//int top1=top;
printf("\n\n");
for(i=1;i<=rows;i++)
{
	if(i==1||i==rows)
		for(j=1;j<=coloms;j++)
		{
			if(i==1)
			{
				if(j<=rows/2)
				printf("   ");
				else
				printf("  *");
			}
			else
			{
				if(j>=rows/2+2)
				printf("   ");
				else
				//printf("%-3.2d",start++);
				printf("  *");
			}
		}
	else
	{
		if(i<=rows/2+1)
			printf("  *");
		else
			printf("   ");
		for(int space=1;space<=coloms-2;space++)
		{
			if((coloms/2)==space)
				printf("  *");
			else if(i==rows/2+1)
				printf("  *");
			else
				printf("   ");
		}
		if(i>rows/2)
			printf("  *");
		else
			printf("   ");
	}
printf("\n");
}
getch();
}