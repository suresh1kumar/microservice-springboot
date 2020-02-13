#include<conio.h>
#include<stdio.h>

void main()
{
clrscr();
int a[5],p,f=0,j;
printf("Enter 5 Elements:\n");
for(int i=0;i<5;i++)
scanf("%d",&a[i]);

printf("\n\nEnter position to Delete Element:\n");
scanf("%d",&p);
if(!(p>=1&&p<=5))
printf("\nDeletion is not posible");
else
{
	for(i=p-1;i<5;i++)
	{
		a[i]=a[i+1]; f=1;
	}
}
if(f==1)
{
printf("\nElements are:");
for(i=0;i<4;i++)
printf("\n%d",a[i]);
}
getch();
}