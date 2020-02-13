#include<conio.h>
#include<stdio.h>
void findAdjacent(int ,int ,int matrix[3][3])   ;
void main()
{
clrscr();
int n;
int matrix[3][3]={1,2,3,4,5,6,7,8,9};
//printf("\nEnter Matrix : ");
//for(int row=0;row<3;row++)
//for(int col=0;col<3;col++)
//scanf("%d",&matrix[row][col]);
clrscr();
for( int row=0;row<3;row++)
{
	for(int col=0;col<3;col++)
		printf("%d\t",matrix[row][col]);
	printf("\n");
}
printf("\nEnter Element:");
scanf("%d",&n);
int f=0,row1,col1;
for(row=0;row<3;row++)
{
	for(int col=0;col<3;col++)
	{
		if(n==matrix[row][col])
		{
		//findAdjacent(row,col,matrix);
		f=1;    row1=row;col1=col;
		break;
		}
	}
}
if(f==1)
{
findAdjacent(row1,col1,matrix);
}
else
printf("\nElement not found");

getch();
}

void findAdjacent(int row,int col,int matrix[3][3])
{
for( int row1=row;row1<3;row1++)
{
	for(int col1=col;col1<3;col1++)
	{
		if()
		printf("%d\t",matrix[row1][col1]);
	}
}

}