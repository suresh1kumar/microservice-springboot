#include<conio.h>
#include<stdio.h>
void main()
{
clrscr();
int i,j,max1=0,max2=0,min1,min2,t1,t2;
int a[5]={11,2,3,77,4};
printf("\nArray is : ");
for(i=0;i<5;i++)
{
printf("\n%d",a[i]);
}
max1=a[0];
min1=a[0];
for(i=1;i<5;i++)
{
	if(max1<a[i])
	{
		max1=a[i];
	}
	if(min1>a[i])
	{
		min1=a[i];
	}
}

max2=a[0];
min2=a[0];
for(i=1;i<5;i++)
{
	if(max2<a[i]&&max1!=a[i])
	{
		max2=a[i];
	}
	if(min2>a[i]&&min1!=a[i])
	{
		min2=a[i];
	}
}

printf("\nMax1 : %d  Min1 : %d\nMax2 : %d Min2 : %d",max1,min1,max2,min2);
getch();
}