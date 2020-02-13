#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int a[5];
int max1,max2;
printf("\nEnter 5 Elements:\n");
for(int i=0;i<5;i++)
scanf("%d",&a[i]);

max1=a[0];
for(i=0;i<5;i++)
{
	if(max1<a[i])
	max1=a[i];
}
max2=a[0];
for(i=0;i<5;i++)
{
	if(max2<a[i]&&max1!=a[i])
	max2=a[i];
}

printf("First Max  : %d",max1);
printf("\nSecond Max : %d",max2);

getch();
}